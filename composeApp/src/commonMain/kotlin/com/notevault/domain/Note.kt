package com.notevault.domain

import kotlin.jvm.JvmInline

data class Note(
    val id: String,
    val title: NoteTitle,
    val content: NoteContent,
    val type: NoteType,
    val createdAt: Long
)

@JvmInline
value class NoteTitle(val value: String) {
    init { require(value.isNotBlank()) { "Title cannot be blank" } }
}

@JvmInline
value class NoteContent(val value: String)

enum class NoteType { TEXT, MARKDOWN }
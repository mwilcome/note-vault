package com.notevault.domain

interface NoteRepository {
    suspend fun getAll(): List<Note>
    suspend fun insert(note: Note)
    suspend fun update(note: Note)
    suspend fun delete(id: String)
}
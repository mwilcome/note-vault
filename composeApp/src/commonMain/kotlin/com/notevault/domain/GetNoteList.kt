package com.notevault.domain

class GetNoteList(private val repository: NoteRepository) {
    suspend operator fun invoke(): List<Note> = repository.getAll()
}
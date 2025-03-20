package com.notevault.domain

class CreateNote(private val repository: NoteRepository) {
    suspend operator fun invoke(note: Note) = repository.insert(note)
}
package com.immaterial.service

class NotesService {

    private val notes: MutableList<Note> = mutableListOf()
    private var nextId = 1

    fun getNotes(): List<Note> {
        return this.notes
    }

    fun getNoteById(id: Int): Note {
        return this.notes.first { it.id == id }
    }

    fun addNote(note: Note): List<Note> {
        note.id = nextId
        this.notes.add(note)
        nextId++
        return this.notes
    }

    fun removeById(id: Int): List<Note> {
        notes.remove(notes.first { it.id == id })
        return this.notes
    }

    fun update(note: Note): List<Note> {
        this.removeById(note.id)
        addNote(note)
        return this.notes
    }

}

data class Note(var id: Int = 0, val title: String, val note: String)
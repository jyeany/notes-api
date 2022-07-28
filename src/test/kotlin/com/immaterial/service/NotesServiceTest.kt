package com.immaterial.service

import kotlin.random.Random
import kotlin.test.Test
import kotlin.test.assertEquals

class NotesServiceTest {

    private val notesService = NotesService()

    @Test
    fun addNote() {
        val title = "note title"
        val body = "body of note"
        val toAdd = Note(title = title, body = body)
        val result = notesService.addNote(toAdd)
        assertEquals(1, result.size)
        assertEquals(result[0].title, title)
        assertEquals(result[0].body, body)
    }

}
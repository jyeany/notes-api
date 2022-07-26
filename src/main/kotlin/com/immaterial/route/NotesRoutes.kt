package com.immaterial.route

import com.immaterial.service.Note
import com.immaterial.service.NotesService
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

val notesService = NotesService()

fun Route.notesRoutes() {
    get("/notes") {
        val notes = notesService.getNotes()
        call.respond(notes)
    }
    get("/notes/{id}") {
        val id = call.parameters["id"]?.toInt()!!
        val note = notesService.getNoteById(id)
        call.respond(note)
    }
    post("/notes") {
        val note = call.receive<Note>()
        val notes = notesService.addNote(note)
        call.respond(notes)
    }
    delete("/notes/{id}") {
        val id = call.parameters["id"]?.toInt()!!
        val notes = notesService.removeById(id)
        call.respond(notes)
    }
}

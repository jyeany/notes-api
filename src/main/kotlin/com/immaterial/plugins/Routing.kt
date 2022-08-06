package com.immaterial.plugins

import com.immaterial.route.metricsRoutes
import com.immaterial.route.notesRoutes
import com.immaterial.service.Note
import com.immaterial.service.NotesService
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        notesRoutes()
        metricsRoutes()
    }
}

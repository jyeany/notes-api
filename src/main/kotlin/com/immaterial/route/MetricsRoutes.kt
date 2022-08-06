package com.immaterial.route

import com.immaterial.plugins.appMicrometerRegistry
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.metricsRoutes() {
    get("/metrics") {
        call.respondText(appMicrometerRegistry.scrape())
    }
}
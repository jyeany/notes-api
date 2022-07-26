package com.immaterial

import com.immaterial.plugins.configureContentNegotiation
import com.immaterial.plugins.configureHTTP
import com.immaterial.plugins.configureRouting
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureHTTP()
        configureRouting()
        configureContentNegotiation()
    }.start(wait = true)
}

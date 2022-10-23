package org.cgsira.routings

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.configureRouting() {
    get("/") {
        call.respondText("Hello World!")
    }

    get("/graalvm"){
        call.respondText("Hello GraalVM!")
    }
}

package dev.alpas.fireplace.controllers

import dev.alpas.http.HttpCall
import dev.alpas.routing.Controller

class WelcomeController : Controller() {
    fun index(call: HttpCall) {
        call.render("welcome")
    }
}

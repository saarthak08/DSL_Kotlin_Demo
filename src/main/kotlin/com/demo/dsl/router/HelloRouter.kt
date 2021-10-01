package com.demo.dsl.router

import com.demo.dsl.handler.HelloHandler
import org.springframework.web.reactive.function.server.coRouter

class HelloRouter(private val helloHandler: HelloHandler) {
    val helloRouter = coRouter {
        GET("/hello", helloHandler::hello)
    }
}
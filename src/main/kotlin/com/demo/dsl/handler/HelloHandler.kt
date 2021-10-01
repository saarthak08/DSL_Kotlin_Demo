package com.demo.dsl.handler

import kotlinx.coroutines.flow.flow
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.bodyAndAwait

class HelloHandler {
    suspend fun hello(req: ServerRequest): ServerResponse {
        return ServerResponse.ok().bodyAndAwait(flow { emit("Hello") })
    }
}
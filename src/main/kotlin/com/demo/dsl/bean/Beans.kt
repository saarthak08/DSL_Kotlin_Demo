package com.demo.dsl.bean

import com.demo.dsl.router.HelloRouter
import org.springframework.context.support.beans

val beans = beans {
    bean<com.demo.dsl.handler.HelloHandler>()
    bean {
        HelloRouter(ref()).helloRouter
    }
}
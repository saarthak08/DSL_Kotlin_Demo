package com.demo.dsl

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DslDemoApplication

fun main(args: Array<String>) {
	runApplication<DslDemoApplication>(*args)
}

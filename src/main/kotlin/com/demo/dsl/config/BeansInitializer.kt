package com.demo.dsl.config

import com.demo.dsl.bean.beans
import org.springframework.context.ApplicationContextInitializer
import org.springframework.context.support.GenericApplicationContext

class BeansInitializer : ApplicationContextInitializer<GenericApplicationContext> {
    override fun initialize(context: GenericApplicationContext) {
        beans.initialize(context)
    }
}
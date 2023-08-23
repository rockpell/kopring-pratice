package com.rockpell

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import org.springframework.web.servlet.DispatcherServlet

@SpringBootApplication
@EnableJpaAuditing
class BootstrapApplication

fun main(args: Array<String>) {
    val ctx = runApplication<BootstrapApplication>(*args)
    val dispatcherServlet = ctx.getBean("dispatcherServlet") as DispatcherServlet
    dispatcherServlet.setThrowExceptionIfNoHandlerFound(true)
}

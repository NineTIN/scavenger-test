package com.example.application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.ApplicationPidFileWriter
import org.springframework.boot.runApplication

@SpringBootApplication(
    scanBasePackages = ["com.example.application"]
)
class Application

fun main(args: Array<String>) {
    runApplication<Application>(args = args) {
        addListeners(ApplicationPidFileWriter())
    }
}

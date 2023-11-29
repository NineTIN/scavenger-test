package com.example.application.controller

import com.example.application.service.HealthCheckService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthCheckController(val healthCheckService: HealthCheckService) {
    @GetMapping("/health")
    fun healthCheck(): String {
        return "OK"
    }

    @GetMapping("/health/service")
    fun healthCheckService(): String {
        return healthCheckService.getHealthCheck()
    }
}

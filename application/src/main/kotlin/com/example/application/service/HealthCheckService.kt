package com.example.application.service

import org.springframework.stereotype.Service

@Service
class HealthCheckService {
    fun getHealthCheck(): String {
        return "OK for Service"
    }
}

package com.example.studentmanagement

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Contact
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.License
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SwaggerConfiguration {
    @Bean
    fun customOpenAPI(): OpenAPI {
        return OpenAPI().info(apiInfo())
    }

    private fun apiInfo(): Info {
        return Info()
            .title("Students Management API")
            .description("API for managing students processes")
            .version("2.0")
            .contact(apiContact())
            .license(apiLicense())
    }

    private fun apiLicense(): License {
        return License()
            .name("MIT License")
            .url("#")
    }

    private fun apiContact(): Contact {
        return Contact()
            .name("MTech Innovations")
            .email("bigmitchsystems@gmail.com")
            .url("https://mitcht.netlify.app/")
    }
}
package com.example.studentmanagement

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/students")
class ClassRestController(val classService: ClassService) {

    @GetMapping("/classes")
    fun getClasses(): List<String> {
        return classService.classNames(2)
    }
}
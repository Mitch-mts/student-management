package com.example.studentmanagement.api

import com.example.studentmanagement.domain.Students
import com.example.studentmanagement.dto.StudentRequest
import com.example.studentmanagement.service.StudentService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/student")
class StudentRestController(private val studentService: StudentService) {

    @GetMapping("/list")
    fun getAllStudents(): List<Students> {
        return studentService.getAllStudents()
    }

    @GetMapping("/{id}")
    fun getStudentById(@PathVariable("id") id: Long): Students {
        return studentService.getStudentById(id)
    }

    @PostMapping
    fun createStudent(@RequestBody request: StudentRequest): Students {
        return studentService.createStudent(request)
    }
}
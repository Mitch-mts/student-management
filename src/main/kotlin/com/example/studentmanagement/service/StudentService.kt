package com.example.studentmanagement.service

import com.example.studentmanagement.domain.Students
import com.example.studentmanagement.dto.StudentRequest

interface StudentService {
    fun getAllStudents(): List<Students>
    fun getStudentById(id: Long): Students

    fun createStudent(request: StudentRequest): Students
}
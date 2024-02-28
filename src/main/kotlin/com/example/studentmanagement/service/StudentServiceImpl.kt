package com.example.studentmanagement.service

import com.example.studentmanagement.domain.Students
import com.example.studentmanagement.dto.StudentRequest
import com.example.studentmanagement.persistance.StudentRepository
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class StudentServiceImpl(private val studentRepository: StudentRepository): StudentService {
    override fun getAllStudents(): List<Students> {
        return studentRepository.findAll()
    }

    override fun getStudentById(id: Long): Students {
         return studentRepository.findById(id).get()
    }

    override fun createStudent(request: StudentRequest): Students {
        val studentRequest: Students = Students(null,
            request.firstname,
            request.lastname,
            request.classname,
            LocalDateTime.now())

        return studentRepository.save(studentRequest)
    }


}
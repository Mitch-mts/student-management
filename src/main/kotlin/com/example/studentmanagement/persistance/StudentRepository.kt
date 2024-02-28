package com.example.studentmanagement.persistance

import com.example.studentmanagement.domain.Students
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentRepository: JpaRepository<Students, Long> {

}
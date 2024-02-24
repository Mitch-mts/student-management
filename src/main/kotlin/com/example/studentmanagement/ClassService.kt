package com.example.studentmanagement

import org.springframework.stereotype.Service


interface ClassService {
    fun classNames(classNumber: Int): List<String>
}
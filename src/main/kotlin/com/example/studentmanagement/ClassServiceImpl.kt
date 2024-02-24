package com.example.studentmanagement

import org.springframework.stereotype.Service

@Service
class ClassServiceImpl: ClassService {
    override fun classNames(classNumber: Int): List<String> {
        val classNamesList = listOf("Yellow $classNumber", "Green", "Red", "Blue")
        return classNamesList
    }
}
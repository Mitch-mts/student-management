package com.example.studentmanagement

class ClassServiceImpl: ClassService {
    override fun classNames(): List<String> {
        val classNamesList = listOf("Yellow", "Green", "Red", "Blue")
        return classNamesList
    }
}
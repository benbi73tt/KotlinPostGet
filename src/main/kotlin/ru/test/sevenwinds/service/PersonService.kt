package ru.test.sevenwinds.service

import ru.test.sevenwinds.person.Person

interface PersonService {

    fun findAll(): List<Person>

    fun findByName(name: String): Person?

    fun save(person: Person)
}
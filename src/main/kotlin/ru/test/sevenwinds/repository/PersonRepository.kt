package ru.test.sevenwinds.repository

import org.springframework.data.jpa.repository.JpaRepository
import ru.test.sevenwinds.person.Person

interface PersonRepository : JpaRepository<Person, Int> {

    fun findByName(name: String): Person?

}
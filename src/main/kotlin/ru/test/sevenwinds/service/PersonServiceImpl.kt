package ru.test.sevenwinds.service

import org.springframework.stereotype.Service
import ru.test.sevenwinds.person.Person
import ru.test.sevenwinds.repository.PersonRepository


@Service
class PersonServiceImpl(private val personRepository: PersonRepository) : PersonService {
    override fun findAll(): List<Person> {
        return personRepository.findAll()
    }

    override fun findByName(name: String): Person? {
        return personRepository.findByName(name)
    }

    override fun save(person: Person) {
        personRepository.save(person)
    }


}
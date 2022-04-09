package ru.test.sevenwinds.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import ru.test.sevenwinds.person.Person
import ru.test.sevenwinds.service.PersonService

@RestController
@RequestMapping("/svs")
class MainController(private val personService: PersonService) {

    @GetMapping("/test/{name}")
    fun get(@PathVariable("name") name: String): ResponseEntity<Any> {
        val person = personService.findByName(name)
        return if (person != null) {
            ResponseEntity.ok(person)
        } else
            ResponseEntity.notFound().build()
        return ResponseEntity.ok("name $name")
    }


    @PostMapping("/test/add")
    fun post(@RequestBody person: Person) {
        personService.save(person)
    }
}
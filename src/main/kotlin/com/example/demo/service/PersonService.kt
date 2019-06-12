package com.example.demo.service

import com.example.demo.repository.PersonRepository
import org.springframework.stereotype.Component

@Component
class PersonService(private val personRepository: PersonRepository) {

    fun getPersonById(id: String) = personRepository.findById(id)
    fun getPersonsByName(name: String) = personRepository.findByNameLike(name)
}
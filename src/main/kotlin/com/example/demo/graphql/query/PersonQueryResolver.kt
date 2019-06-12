package com.example.demo.graphql.query

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.example.demo.service.PersonService
import org.springframework.stereotype.Component

@Component
class PersonQueryResolver(val personService: PersonService): GraphQLQueryResolver {
    fun person(id: String) = personService.getPersonById(id)
    fun personsByName(name: String) = personService.getPersonsByName(name)
}
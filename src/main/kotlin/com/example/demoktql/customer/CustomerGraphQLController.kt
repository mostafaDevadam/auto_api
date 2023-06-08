package com.example.demoktql.customer

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller
import java.util.*

interface CustomerInput {
    var name: String
}

@Controller
class CustomerGraphQLController {

    @Autowired
    //lateinit var customerRepo: CustomerRepository
    lateinit var custService: CustomerService

    @QueryMapping
    public fun allCustomers(): Iterable<CustomerEntity> = custService.findAll() // customerRepo.findAll()

    @QueryMapping
    public fun customerById(@Argument id: Long): Optional<CustomerEntity> {
        val one = custService.findOneById(id) //customerRepo.findById(id)
        return one;
    }

    @MutationMapping
    public fun createCustomer(@Argument customer: CustomerEntity): CustomerEntity {
        val one = custService.create(customer) //customerRepo.save(customer)
        return one
    }


}
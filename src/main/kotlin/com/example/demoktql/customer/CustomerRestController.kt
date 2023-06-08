package com.example.demoktql.customer

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/cust")
class CustomerRestController {

    @Autowired
    //lateinit var customerRepo: CustomerRepository
    lateinit var custService: CustomerService

    @GetMapping
    public fun start(): String = "start cust api"


    @PostMapping
    public fun create(@RequestBody data: CustomerEntity): String {


        val newCust = custService.create(data)
        return "created!"
    }

    @GetMapping("/all")
    public fun create(): Iterable<CustomerEntity> {
        return custService.findAll()
    }

    @GetMapping("/{id}")
    public  fun getOne(@PathVariable id: Long): Optional<CustomerEntity> {
        val one = custService.findOneById(id)
        return one
    }
}
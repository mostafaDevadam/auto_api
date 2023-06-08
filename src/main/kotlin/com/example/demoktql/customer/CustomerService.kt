package com.example.demoktql.customer

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class CustomerService {

    @Autowired
    lateinit var customerRepo: CustomerRepository

    public fun create(data: CustomerEntity): CustomerEntity {
        val one = customerRepo.save(data)
        return one
    }

    public fun findAll(): Iterable<CustomerEntity> = customerRepo.findAll()

    public fun findOneById(id: Long): Optional<CustomerEntity> {
        val one = customerRepo.findById(id)
        return one
    }

}
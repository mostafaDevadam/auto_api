package com.example.demoktql.customer

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository: CrudRepository<CustomerEntity , Long> {
}
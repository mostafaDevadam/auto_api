package com.example.demoktql.customer

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class CustomerEntity(
    val name: String,
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = -1
) {

    private constructor(): this("")

}
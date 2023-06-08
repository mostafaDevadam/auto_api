package com.example.demoktql.car

import com.example.demoktql.user.User
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class CarController {

    @MutationMapping
    public fun createCar(@Argument id: String,
                          @Argument name: String): Car {
        var n = Car.ob.create(id, name)
        return n
    }

    @QueryMapping
    public fun allCars(): List<Car> {
        return Car.ob.findAll()

    }

    @QueryMapping
    public fun carById(@Argument id: String): User {
        return User.obj.findOne(id)
    }




}
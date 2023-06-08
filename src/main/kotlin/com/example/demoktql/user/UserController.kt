package com.example.demoktql

import com.example.demoktql.car.Car
import com.example.demoktql.user.User
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.graphql.data.method.annotation.SchemaMapping
import org.springframework.stereotype.Controller

interface IUser {
    var id: String
    var name: String
}

@Controller
class UserController {

    var user : User = User()

    @QueryMapping
    public fun hello(): String = "hello world"

    @QueryMapping
    public fun allUsers(): List<User> {
       return User.obj.findAll()

    }

    @QueryMapping
    public fun userById(@Argument id: String): User {
     return  User.obj.findOne(id)
    }


    @SchemaMapping
    public fun car(user: User): Car {
        val one = Car.ob.findOne(user.getCarId1())
         return one
    }

    @SchemaMapping
    public fun cars(user: User): List<String> {
        val s = user.getCarIds()
        return s
    }

    @SchemaMapping
    public fun autos(user: User): ArrayList<Car> {
        val ids = user.getCarIds()
        var list: ArrayList<Car> = arrayListOf()

        for (el in ids) {
            val l = Car.ob.findOne(el)
            list.add(l)
        }

        return list
    }

    @MutationMapping
    public fun createUser(@Argument id: String,
                          @Argument name: String,
                          @Argument carId: String,
                          @Argument carIds: ArrayList<String>
                          ): User {
        var n = User.obj.create(id, name, carId, carIds)
        return n
    }



}
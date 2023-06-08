package com.example.demoktql.user

import java.util.*
import kotlin.collections.ArrayList


class User() {


    var id: String = ""
    var name: String = ""
     public var carId: String = ""
      public var cardIds: ArrayList<String> =  arrayListOf()

    object obj {


        var users: ArrayList<User> = arrayListOf()


        fun create(id: String, name: String, carId: String = "",
                   cardIds: ArrayList<String> //= arrayListOf<String>("1","2")
        ): User {
            var user = User()
            user.id = id
            user.name = name
            user.carId = carId
            user.cardIds = cardIds
            //user.cardIds.add("1")
            //user.cardIds.add("2")
            //user.cardIds.add("3")
            users.add(user)

            return user
        }

        fun findAll (): ArrayList<User> = users

        fun findOne(id: String): User {
            val one = users.filter { e-> e.id == id }
            return one[0]
        }


    }



    @JvmName("getCarId1")
    public fun getCarId1(): String {
        return carId
    }

    @JvmName("getCarIds")
    public fun getCarIds(): ArrayList<String> {
        return cardIds
    }



}
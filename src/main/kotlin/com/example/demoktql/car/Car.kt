package com.example.demoktql.car




 class Car() {

     var id: String = ""
     var name: String = ""

     object ob {

         var cars: ArrayList<Car> = arrayListOf()

         fun create(id: String, name: String): Car {
             var car = Car()
             car.id = id
             car.name = name
             cars.add(car)

             return car
         }

         fun findAll(): ArrayList<Car> = cars

         fun findOne(id: String) : Car {
             val one = cars.filter { e-> e.id == id }
             return one[0]
         }




 }



 }
















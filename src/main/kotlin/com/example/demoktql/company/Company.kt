package com.example.demoktql.company

import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import org.springframework.web.bind.annotation.Mapping
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Company(

    @Setter
    @Getter

    var name: String,
    @Id @GeneratedValue( strategy = GenerationType.AUTO)
    val id: Long = -1

) {
    private constructor(): this("")

/*
    public fun name(name: String){
        this.name = name;
    }

    public fun name(): String{
        return this.name;
    }

 */


}
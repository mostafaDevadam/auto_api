package com.example.demoktql.company

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.graphql.data.method.annotation.SchemaMapping
import org.springframework.stereotype.Controller
import java.util.Optional

@Controller
class CompanyGraphQLController {

    @Autowired
    lateinit var companyService: CompanyService

    @Autowired
    lateinit var companyRepo: CompanyRepository


    // query

    @QueryMapping
    fun allCompanies() = companyService.findAll()

    @QueryMapping
    fun companyById(@Argument id: Long): Optional<Company>{
       val one = companyService.findOneById(id)
        return one
    }

    // mutation

    @MutationMapping
    fun addCompany(@Argument company: Company): Company{
        val new_one = companyService.create(company)
        return new_one

    }


    @MutationMapping//("updateCompany")
    fun updateCompany(@Argument id: Long, @Argument company: Company): Company {
        return companyService.updateOne(id, company)




    }

    @MutationMapping
    fun removeCompany(@Argument id: Long): String{
        val removed = companyService.removeOne(id)
        return "Removed!"
    }

    //
    /*
    @SchemaMapping
    fun customers(@Argument company: CompanyEntity) {

    }

     */
}
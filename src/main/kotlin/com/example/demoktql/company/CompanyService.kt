package com.example.demoktql.company

import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class CompanyService {

    @Autowired
    lateinit var companyRepo: CompanyRepository



    fun create(company: Company): Company{
        val new_company = companyRepo.save(company);
        return new_company

    }

    fun findAll() : Iterable<Company> = companyRepo.findAll()

    fun findOneById(id: Long): Optional<Company>{
       val one = companyRepo.findById(id)
        return one
    }

    fun updateOne(id: Long, company: Company): Company {

         val mapper: ModelMapper =  ModelMapper()
        mapper.configuration.setSkipNullEnabled(true)

        val one: Company = companyRepo.findById(id).orElseThrow()
        // wenn jede company.Field_Name != null und company.Field_Name != one.Field_Name
        // kopie company Fields in one Fields
        val mapped = mapper.map(company, one)
        val updated = companyRepo.save(one)
        return updated



        /*

       val one = companyRepo.findById(id).get()
        if(one.name != null ){
            one.name = company.name
        }

        companyRepo.save(one)

        return one

         */
/*
        try {


            val existing: Company = companyRepo.findById(id).get()

            if(existing.name !== null){
                existing.name = company.name
            }
            val updated = companyRepo.save(existing);
            return updated;
        }catch( e: Exception){
            println("error msg: " + e.message)
            return company

        }

 */




        //




    }

    fun removeOne(id: Long) = companyRepo.deleteById(id)
}
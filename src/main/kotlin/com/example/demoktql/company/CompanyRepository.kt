package com.example.demoktql.company

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import org.springframework.web.bind.annotation.Mapping

@Repository

interface CompanyRepository : CrudRepository<Company, Long> {
}
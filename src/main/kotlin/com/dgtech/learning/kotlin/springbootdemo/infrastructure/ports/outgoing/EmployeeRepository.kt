package com.dgtech.learning.kotlin.springbootdemo.infrastructure.ports.outgoing

import com.dgtech.learning.kotlin.springbootdemo.domain.employee.Employee
import com.dgtech.learning.kotlin.springbootdemo.domain.spi.IEmployeeRepository
import org.springframework.data.mongodb.repository.MongoRepository


interface EmployeeRepository : MongoRepository<Employee, String>{
}
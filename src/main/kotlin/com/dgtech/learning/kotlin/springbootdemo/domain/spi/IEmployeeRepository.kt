package com.dgtech.learning.kotlin.springbootdemo.domain.spi

import com.dgtech.learning.kotlin.springbootdemo.domain.annotations.Repository
import com.dgtech.learning.kotlin.springbootdemo.domain.employee.Employee

@Repository
interface IEmployeeRepository {

    fun getAll():List<Employee>
    fun getOneById(id:String) : Employee?
    fun save(employee: Employee): Employee
    fun update(id:String, employee: Employee) : Employee
    fun delete(id: String): String

}

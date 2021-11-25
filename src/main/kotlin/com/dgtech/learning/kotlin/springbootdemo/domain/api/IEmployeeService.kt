package com.dgtech.learning.kotlin.springbootdemo.domain.api

import com.dgtech.learning.kotlin.springbootdemo.domain.employee.Employee

@FunctionalInterface
interface IEmployeeService {

     fun retrieveAllEmployees():List<Employee>
    fun retrieveOneEmployeeById(id:String) : Employee
    fun persistEmployee(employee: Employee): Employee
    fun updateEmployee(id:String, employee: Employee) : Employee
    fun deleteEmployee(id: String): String
}
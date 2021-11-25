package com.dgtech.learning.kotlin.springbootdemo.domain.employee

import com.dgtech.learning.kotlin.springbootdemo.domain.annotations.DomainService
import com.dgtech.learning.kotlin.springbootdemo.domain.api.IEmployeeService
import com.dgtech.learning.kotlin.springbootdemo.infrastructure.ports.outgoing.EmployeeRepository
import org.springframework.stereotype.Component

@DomainService
@Component
class EmployeeService(private val employeeRepository: EmployeeRepository) : IEmployeeService {
     override fun retrieveAllEmployees(): List<Employee> {
        return employeeRepository.findAll()
    }

    override fun retrieveOneEmployeeById(id: String): Employee {
        return employeeRepository.findById(id).orElse(null)
    }

    override fun persistEmployee(employee: Employee): Employee {
       return  employeeRepository.save(employee)
    }

    override fun updateEmployee(id: String, employee: Employee) : Employee {
        val existingEmployee: Employee = employeeRepository.findById(id).orElse(null)
        return employeeRepository.save(employee)
    }

    override fun deleteEmployee(id: String) :String{
        employeeRepository.deleteById(id)
        return "deleted successfully"
    }
}
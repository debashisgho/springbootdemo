package com.dgtech.learning.kotlin.springbootdemo.infrastructure.ports.incoming.controller

import com.dgtech.learning.kotlin.springbootdemo.domain.api.IEmployeeService
import com.dgtech.learning.kotlin.springbootdemo.domain.employee.Employee
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiParam
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/employees")


class EmployeeController(private val employeeService: IEmployeeService) {

    @GetMapping("/test")
    @ApiOperation(value = "dummy test API", notes ="invoke this to find out whether api backend is working or not")
    fun test():String{
        return "Hello ! test is working"
    }

    @GetMapping
      fun getAllEmployees(): ResponseEntity<List<Employee>> {

        return ResponseEntity.ok(employeeService.retrieveAllEmployees());
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Fetch one employee by employee id", notes ="Fetch one employee data by employee id")
     fun getOneEmployee(@ApiParam(value ="employee id of the employee which you want to retrieve", required = true) @PathVariable id: String): ResponseEntity<Employee> {
        return ResponseEntity.ok(employeeService.retrieveOneEmployeeById(id))
    }

    @PostMapping
    fun saveEmployee(@RequestBody employee: Employee): ResponseEntity<Employee> {
        return ResponseEntity.ok(employeeService.persistEmployee(employee))
    }

    @PutMapping("/{id}")
    fun updateEmployee(@PathVariable id:String , @RequestBody employee: Employee): ResponseEntity<Employee> {
        var existingEmployee: Employee = employeeService.retrieveOneEmployeeById(id)
        return ResponseEntity.ok(employeeService.persistEmployee(employee))
    }
    @DeleteMapping("/{id}")
    fun deleteEmployee(@PathVariable id:String): ResponseEntity<String> {

        return ResponseEntity.ok(employeeService.deleteEmployee(id))
    }

}
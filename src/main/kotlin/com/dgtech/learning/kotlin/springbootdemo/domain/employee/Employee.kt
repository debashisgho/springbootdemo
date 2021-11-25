package com.dgtech.learning.kotlin.springbootdemo.domain.employee

import io.swagger.annotations.ApiModelProperty
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Employee(
    @ApiModelProperty(notes = "The unique id of the employee")
    @Id
    val id: String,
    @ApiModelProperty(notes = "Name of the employee")
    val name: String
)

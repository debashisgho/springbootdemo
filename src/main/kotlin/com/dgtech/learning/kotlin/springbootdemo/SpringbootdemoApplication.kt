package com.dgtech.learning.kotlin.springbootdemo

import io.swagger.annotations.Api
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.service.Contact
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2
import java.util.*


@SpringBootApplication
//@ComponentScan(basePackages = ["com.dgtech.learning"])
class SpringbootdemoApplication

	fun main(args: Array<String>) {
		runApplication<SpringbootdemoApplication>(*args)
	}





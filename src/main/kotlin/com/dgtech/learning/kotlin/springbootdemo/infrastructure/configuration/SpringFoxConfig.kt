package com.dgtech.learning.kotlin.springbootdemo.infrastructure.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.service.Contact
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2
import java.util.*

@Configuration
@EnableSwagger2
class SpringFoxConfig {
    @Bean
    fun getSwaggerDocketConfig(): Docket {
        return Docket(DocumentationType.SWAGGER_2)
                .select()
               // .paths(PathSelectors.ant("/api/*"))   //by selecting /api we are omitting the /error path of springboot
                .apis(RequestHandlerSelectors.basePackage("com.dgtech"))
                .build()
                .apiInfo(getApiInfo())
    }

    fun getApiInfo(): ApiInfo {
        return ApiInfo(
                "SpringBoot kotlin demo API",
                "Demo list of APIs to interact with an employee backend model",
                "1.0",
                "fre license",
                Contact("Debashis Ghosh", "http://debashis.com", "debashisgho@gmail.com"),
                "API license",
                "http://debashis.com",
                Collections.emptyList()
        )
    }
}
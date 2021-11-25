package com.dgtech.learning.kotlin.springbootdemo.domain.annotations



//COULD NOT FIND A WAY TO USE THIS. EVEN THOUGH I DENOTED THE SERVICE CLASS WITH THIS

import java.lang.annotation.Inherited

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS)
@Inherited
annotation class DomainService


package com.dgtech.learning.kotlin.springbootdemo.domain.annotations

import java.lang.annotation.Inherited

@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.CLASS)
@Inherited
annotation class Repository

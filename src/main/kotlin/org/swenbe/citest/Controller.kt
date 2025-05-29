package org.swenbe.citest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class Controller {

    @GetMapping("/hello")
    fun hello(): String = "Hello World"
    
    @GetMapping("/greeting")
    fun greeting(): String = "Hello World"
}
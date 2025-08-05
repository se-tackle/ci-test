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
    fun greeting(): String = "Hello World1"

    @GetMapping("/greeting2")
    fun greeting2(): String = "Hello World2"

    @GetMapping("/greeting3")
    fun greeting3(): String = "Hello World3"

    @GetMapping("/greeting4")
    fun greeting4(): String = "Hello World4"
}
package org.swenbe.citest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CiTestApplication

fun main(args: Array<String>) {
    runApplication<CiTestApplication>(*args)
}

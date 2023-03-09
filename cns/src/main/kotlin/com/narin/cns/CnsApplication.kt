package com.narin.cns

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CnsApplication

fun main(args: Array<String>) {
	runApplication<CnsApplication>(*args)
}

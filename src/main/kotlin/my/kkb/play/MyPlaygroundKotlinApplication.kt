package my.kkb.play

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyPlaygroundKotlinApplication

fun main(args: Array<String>) {
	runApplication<MyPlaygroundKotlinApplication>(*args)
}

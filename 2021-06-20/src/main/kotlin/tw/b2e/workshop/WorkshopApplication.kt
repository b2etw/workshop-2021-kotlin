package tw.b2e.workshop

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WorkshopApplication

fun main(args: Array<String>) {
    runApplication<WorkshopApplication>(*args)
}

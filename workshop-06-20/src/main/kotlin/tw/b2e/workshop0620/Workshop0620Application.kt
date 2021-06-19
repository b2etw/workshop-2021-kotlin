package tw.b2e.workshop0620

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
class Workshop0620Application

fun main(args: Array<String>) {
    runApplication<Workshop0620Application>(*args)
}

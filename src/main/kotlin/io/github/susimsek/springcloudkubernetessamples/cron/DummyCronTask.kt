package io.github.susimsek.springcloudkubernetessamples.cron

import io.github.susimsek.springcloudkubernetessamples.config.DummyProperties
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class DummyCronTask(
    private val dummyProperties: DummyProperties
) {
    @Scheduled(fixedDelay = 5000)
    fun hello() {
        println("Dummy message is: " + dummyProperties.message)
    }
}

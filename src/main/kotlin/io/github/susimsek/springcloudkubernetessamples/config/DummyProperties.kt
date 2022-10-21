package io.github.susimsek.springcloudkubernetessamples.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration(proxyBeanMethods = false)
@ConfigurationProperties("dummy")
data class DummyProperties(
    var message: String = "this is a dummy message"
)

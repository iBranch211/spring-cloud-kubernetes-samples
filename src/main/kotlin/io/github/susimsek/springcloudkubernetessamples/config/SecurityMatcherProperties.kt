package io.github.susimsek.springcloudkubernetessamples.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConfigurationProperties("security-matcher")
@ConstructorBinding
data class SecurityMatcherProperties(
    var ignorePatterns: MutableList<String> = mutableListOf("/graphiql", "/favicon.ico"),
    var permitAllPatterns: MutableList<String> = mutableListOf("/actuator/**", "/graphql")
)

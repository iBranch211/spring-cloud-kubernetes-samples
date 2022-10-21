package io.github.susimsek.springcloudkubernetessamples.exception

data class FieldError(
    var property: String? = null,
    var message: String? = null
)

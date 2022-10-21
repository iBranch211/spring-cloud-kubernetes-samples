package io.github.susimsek.springcloudkubernetessamples.graphql.controller

import io.github.susimsek.springcloudkubernetessamples.graphql.input.LoginInput
import io.github.susimsek.springcloudkubernetessamples.graphql.type.Token
import io.github.susimsek.springcloudkubernetessamples.service.AuthenticationService
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.stereotype.Controller
import javax.validation.Valid

@Controller
class AuthenticationController(private val authenticationService: AuthenticationService) {

    @MutationMapping
    suspend fun login(@Argument @Valid input: LoginInput): Token {
        return authenticationService.authorize(input)
    }
}

package io.github.susimsek.springcloudkubernetessamples.service

import io.github.susimsek.springcloudkubernetessamples.graphql.input.LoginInput
import io.github.susimsek.springcloudkubernetessamples.graphql.type.Token
import io.github.susimsek.springcloudkubernetessamples.security.cipher.SecurityCipher
import io.github.susimsek.springcloudkubernetessamples.security.jwt.TokenProvider
import kotlinx.coroutines.reactor.awaitSingle
import org.springframework.security.authentication.ReactiveAuthenticationManager
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.stereotype.Component

@Component
class AuthenticationService(
    private val tokenProvider: TokenProvider,
    private val securityCipher: SecurityCipher,
    private val authenticationManager: ReactiveAuthenticationManager
) {
    suspend fun authorize(credentials: LoginInput): Token {
        return authenticationManager.authenticate(
            UsernamePasswordAuthenticationToken(
            credentials.login, credentials.password
            )
        )
            .map { securityCipher.encrypt(tokenProvider.createToken(it))!! }
            .map { jwt ->
                Token(jwt)
            }.awaitSingle()
    }
}

package io.github.susimsek.springcloudkubernetessamples.repository

import io.github.susimsek.springcloudkubernetessamples.domain.User
import io.github.susimsek.springcloudkubernetessamples.graphql.input.UserFilter
import org.springframework.data.domain.Pageable
import reactor.core.publisher.Flux

interface UserRepositoryOverride {
    fun findAllByFilter(filter: UserFilter?, pageable: Pageable): Flux<User>
}

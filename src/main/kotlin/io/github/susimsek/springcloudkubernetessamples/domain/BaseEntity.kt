package io.github.susimsek.springcloudkubernetessamples.domain

import io.github.susimsek.springcloudkubernetessamples.domain.audit.AbstractUserAuditingEntity
import org.springframework.data.annotation.Id

open class BaseEntity(
    @Id
    var id: String? = null
) : AbstractUserAuditingEntity()

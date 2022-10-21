package io.github.susimsek.springcloudkubernetessamples.service.mapper

interface EntityMapper<E, T> {

    fun toType(entity: E): T

    fun toType(entityList: MutableList<E>): MutableList<T>
}

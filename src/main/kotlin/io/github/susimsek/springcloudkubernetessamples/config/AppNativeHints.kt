package io.github.susimsek.springcloudkubernetessamples.config

import io.github.susimsek.springcloudkubernetessamples.domain.Post
import io.github.susimsek.springcloudkubernetessamples.domain.User
import io.github.susimsek.springcloudkubernetessamples.graphql.enumerated.OrderType
import io.github.susimsek.springcloudkubernetessamples.graphql.enumerated.PostOrderField
import io.github.susimsek.springcloudkubernetessamples.graphql.enumerated.PostStatus
import io.github.susimsek.springcloudkubernetessamples.graphql.enumerated.UserOrderField
import io.github.susimsek.springcloudkubernetessamples.graphql.input.AddPostInput
import io.github.susimsek.springcloudkubernetessamples.graphql.input.AddUserInput
import io.github.susimsek.springcloudkubernetessamples.graphql.input.LoginInput
import io.github.susimsek.springcloudkubernetessamples.graphql.input.PostOrder
import io.github.susimsek.springcloudkubernetessamples.graphql.input.UpdatePostInput
import io.github.susimsek.springcloudkubernetessamples.graphql.input.UserFilter
import io.github.susimsek.springcloudkubernetessamples.graphql.input.UserOrder
import io.github.susimsek.springcloudkubernetessamples.graphql.scalar.GraphQlDateTimeProperties
import io.github.susimsek.springcloudkubernetessamples.graphql.scalar.ScalarUtil
import io.github.susimsek.springcloudkubernetessamples.graphql.type.PostPayload
import io.github.susimsek.springcloudkubernetessamples.graphql.type.Token
import io.github.susimsek.springcloudkubernetessamples.graphql.type.UserPayload
import io.github.susimsek.springcloudkubernetessamples.repository.UserRepositoryOverride
import io.github.susimsek.springcloudkubernetessamples.repository.UserRepositoryOverrideImpl
import io.github.susimsek.springcloudkubernetessamples.security.cipher.CipherProperties
import io.github.susimsek.springcloudkubernetessamples.security.cipher.CryptoUtils
import io.github.susimsek.springcloudkubernetessamples.security.jwt.TokenProperties
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Lazy
import org.springframework.data.repository.query.FluentQuery
import org.springframework.nativex.hint.TypeAccess
import org.springframework.nativex.hint.TypeHint
import org.springframework.validation.FieldError

@TypeHint(
    types = [
        org.springframework.data.repository.PagingAndSortingRepository::class,
        org.springframework.data.repository.CrudRepository::class,
        org.springframework.data.repository.Repository::class,
        org.springframework.data.repository.query.QueryByExampleExecutor::class,
        java.util.Optional::class,
        java.time.OffsetDateTime::class,
        java.time.LocalDateTime::class,
        java.time.LocalDate::class,
        FluentQuery::class,
        FluentQuery.FetchableFluentQuery::class,
        FluentQuery.ReactiveFluentQuery::class],
    access = [TypeAccess.QUERY_PUBLIC_METHODS]
)

@TypeHint(
    typeNames = [
        "io.github.susimsek.springnativegraphqlexample.graphql.scalar.GraphQlDateTimeProperties\$ScalarDefinition"
    ], access = [TypeAccess.RESOURCE, TypeAccess.PUBLIC_CLASSES, TypeAccess.DECLARED_CLASSES,
        TypeAccess.DECLARED_CONSTRUCTORS, TypeAccess.PUBLIC_CONSTRUCTORS, TypeAccess.DECLARED_METHODS,
        TypeAccess.PUBLIC_METHODS, TypeAccess.PUBLIC_FIELDS, TypeAccess.DECLARED_FIELDS]
)

@TypeHint(
    types = [
        ScalarUtil::class,
        CryptoUtils::class,
        CorsProperties::class,
        GraphQlDateTimeProperties::class,
        TokenProperties::class,
        CipherProperties::class,
        SecurityMatcherProperties::class,
        LoginInput::class,
        AddUserInput::class,
        UserPayload::class,
        UserFilter::class,
        UserOrder::class,
        PostOrder::class,
        OrderType::class,
        UserOrderField::class,
        PostOrderField::class,
        AddPostInput::class,
        UpdatePostInput::class,
        PostStatus::class,
        PostPayload::class,
        Token::class,
        User::class,
        Post::class,
        FieldError::class,
        UserRepositoryOverride::class,
        UserRepositoryOverrideImpl::class], access = [
        TypeAccess.RESOURCE, TypeAccess.PUBLIC_CLASSES, TypeAccess.DECLARED_CLASSES,
        TypeAccess.DECLARED_CONSTRUCTORS, TypeAccess.PUBLIC_CONSTRUCTORS, TypeAccess.DECLARED_METHODS,
        TypeAccess.PUBLIC_METHODS, TypeAccess.PUBLIC_FIELDS, TypeAccess.DECLARED_FIELDS]
)
@Lazy(false)
@Configuration(proxyBeanMethods = false)
@ConditionalOnClass(name = ["org.springframework.nativex.NativeListener"])
class AppNativeHints

package com.rockpell.domain.domain.member

import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
data class Address(
    @Column(name = "city", nullable = false, length = 32)
    val city: String,
    @Column(name = "street", nullable = false, length = 32)
    val street: String,
    @Column(name = "zipcode", nullable = false, length = 8)
    val zipcode: String
) {}
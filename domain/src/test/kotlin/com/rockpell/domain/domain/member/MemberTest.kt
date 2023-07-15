package com.rockpell.domain.domain.member

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class MemberTest {
    @Test
    fun test() {
        val member = Member(name = "name")
        Assertions.assertThat(member.name).isEqualTo("name")
    }
}
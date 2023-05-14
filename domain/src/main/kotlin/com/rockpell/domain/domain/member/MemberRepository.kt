package com.rockpell.domain.domain.member

import com.rockpell.domain.domain.member.Member
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository : JpaRepository<Member, Long> {
}
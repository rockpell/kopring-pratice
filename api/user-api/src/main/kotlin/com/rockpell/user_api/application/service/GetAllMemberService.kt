package com.rockpell.user_api.application.service

import com.rockpell.domain.domain.member.Member
import com.rockpell.domain.domain.member.MemberRepository
import com.rockpell.user_api.application.port.`in`.GetAllMemberUseCase
import org.springframework.stereotype.Service

@Service
internal class GetAllMemberService(
    private val memberRepository: MemberRepository
) : GetAllMemberUseCase {
    override fun getAll(): List<Member> {
        return memberRepository.findAll()
    }
}
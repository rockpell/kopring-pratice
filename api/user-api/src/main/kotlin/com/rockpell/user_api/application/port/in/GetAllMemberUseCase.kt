package com.rockpell.user_api.application.port.`in`

import com.rockpell.domain.domain.member.Member

interface GetAllMemberUseCase {
    fun getAll(): List<Member>
}

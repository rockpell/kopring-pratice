package com.rockpell.user_api.adatper.`in`

import com.rockpell.domain.domain.member.Member

class GetAllMemberResponse(
    val members: List<GetAllMemberDto>
)

class GetAllMemberDto(
    val id: Long,
    val name: String,
)

fun List<Member>.toResponse(): GetAllMemberResponse {
    val orders = this.map { GetAllMemberDto(id = it.id, name = it.name) }
    return GetAllMemberResponse(orders)
}
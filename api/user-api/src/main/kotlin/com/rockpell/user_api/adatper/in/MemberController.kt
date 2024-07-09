package com.rockpell.user_api.adatper.`in`

import com.rockpell.user_api.application.port.`in`.GetAllMemberUseCase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/member")
class MemberController(
    private val getAllMemberUseCase: GetAllMemberUseCase,
) {
    @GetMapping("")
    fun getAll(): GetAllMemberResponse {
        val members = getAllMemberUseCase.getAll()
        return members.toResponse()
    }
}

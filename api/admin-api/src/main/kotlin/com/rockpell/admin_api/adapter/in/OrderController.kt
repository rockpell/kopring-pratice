package com.rockpell.admin_api.adapter.`in`

import com.rockpell.admin_api.application.port.`in`.GetAllOrderUseCase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/order")
class OrderController(
    private val getAllOrderUseCase: GetAllOrderUseCase,
) {
    @GetMapping("")
    fun getAll(): GetAllOrderResponse {
        val orderList = getAllOrderUseCase.getAll()
        return orderList.toResponse()
    }
}

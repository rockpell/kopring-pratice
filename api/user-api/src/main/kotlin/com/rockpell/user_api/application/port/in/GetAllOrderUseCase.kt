package com.rockpell.user_api.application.port.`in`

import com.rockpell.domain.domain.order.Order

interface GetAllOrderUseCase {
    fun getAll(): List<Order>
}
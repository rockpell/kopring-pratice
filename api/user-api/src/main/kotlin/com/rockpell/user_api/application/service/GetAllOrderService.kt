package com.rockpell.user_api.application.service

import com.rockpell.domain.domain.order.Order
import com.rockpell.domain.domain.order.OrderRepository
import com.rockpell.user_api.application.port.`in`.GetAllOrderUseCase
import org.springframework.stereotype.Service

@Service
internal class GetAllOrderService(
    private val orderRepository: OrderRepository
) : GetAllOrderUseCase {
    override fun getAll(): List<Order> {
        return orderRepository.findAll()
    }
}
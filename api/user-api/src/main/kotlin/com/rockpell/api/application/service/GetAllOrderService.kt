package com.rockpell.api.application.service

import com.rockpell.api.application.port.`in`.GetAllOrderUseCase
import com.rockpell.domain.domain.order.Order
import com.rockpell.domain.domain.order.OrderRepository
import org.springframework.stereotype.Service

@Service
internal class GetAllOrderService(
    private val orderRepository: OrderRepository
) : GetAllOrderUseCase {
    override fun getAll(): List<Order> {
        return orderRepository.findAll()
    }
}
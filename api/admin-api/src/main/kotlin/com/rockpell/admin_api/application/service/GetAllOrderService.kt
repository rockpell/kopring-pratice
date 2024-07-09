package com.rockpell.admin_api.application.service

import com.rockpell.admin_api.application.port.`in`.GetAllOrderUseCase
import com.rockpell.domain.domain.order.Order
import com.rockpell.domain.domain.order.OrderRepository
import org.springframework.stereotype.Service

@Service("AdminGetAllOrderService")
internal class GetAllOrderService(
    private val orderRepository: OrderRepository,
) : GetAllOrderUseCase {
    override fun getAll(): List<Order> {
        return orderRepository.findAll()
    }
}

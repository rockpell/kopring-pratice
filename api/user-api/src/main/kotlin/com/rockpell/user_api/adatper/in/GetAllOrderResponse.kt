package com.rockpell.user_api.adatper.`in`

import com.rockpell.domain.domain.order.Order
import com.rockpell.domain.domain.order.OrderStatus
import java.time.LocalDateTime

class GetAllOrderResponse(
    val orders: List<GetAllOrderDto>
)

class GetAllOrderDto(
    val id: Long,
    val orderDate: LocalDateTime,
    val orderStatus: OrderStatus
)

fun List<Order>.toResponse(): GetAllOrderResponse {
    val orders = this.map { GetAllOrderDto(id = it.id, orderDate = it.orderDate, orderStatus = it.status) }
    return GetAllOrderResponse(orders)
}
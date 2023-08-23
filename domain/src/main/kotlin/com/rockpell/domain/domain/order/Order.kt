package com.rockpell.domain.domain.order

import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "orders")
class Order(
//    member: Member,
    status: OrderStatus = OrderStatus.ORDER,
    orderDate: LocalDateTime = LocalDateTime.now()
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    val id: Long = 0

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "member_id", nullable = false)
//    var member: Member = member
//        protected set

    @Column(name = "order_date", nullable = false)
    var orderDate: LocalDateTime = orderDate // 주문시간
        protected set

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false, columnDefinition = "enum('ORDER', 'CANCEL')")
    var status: OrderStatus = status
        protected set
}

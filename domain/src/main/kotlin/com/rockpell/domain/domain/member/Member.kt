package com.rockpell.domain.domain.member

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "member")
class Member(
    name: String,
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    val id: Long = 0

    @Column(name = "name", nullable = false, length = 32)
    var name: String = name
        protected set

//    @Embedded
//    var address: Address = address
//        protected set
//
//    @OneToMany(mappedBy = "member")
//    val orders: List<Order> = ArrayList()
}

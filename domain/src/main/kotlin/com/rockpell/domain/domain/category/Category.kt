package com.rockpell.domain.domain.category

import javax.persistence.*


@Entity
@Table(name = "category")
class Category(
    name: String
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    val id: Long = 0

    var name: String = name
        protected set

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    var parent: Category? = null
        protected set

    @OneToMany(mappedBy = "parent")
    var child: MutableList<Category> = ArrayList()
        protected set

    fun addChildCategory(child: Category) {
        this.child.add(child)
        child.parent = this
    }
}
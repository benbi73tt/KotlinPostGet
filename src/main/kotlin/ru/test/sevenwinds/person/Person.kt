package ru.test.sevenwinds.person

import javax.persistence.*

@Entity
@Table(name = "person", schema = "public")
open class Person {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int? = null

    @Basic
    @Column(name = "name")
    open var name: String? = null

    @Basic
    @Column(name = "sname")
    open var sname: String? = null

    @Basic
    @Column(name = "fname")
    open var fname: String? = null

    @Basic
    @Column(name = "email")
    open var email: String? = null

    @Basic
    @Column(name = "number")
    open var number: String? = null


    override fun toString(): String {
        return "Person(id=$id, " +
                "name=$name, " +
                "sname=$sname, " +
                "fname=$fname, " +
                "email=$email, " +
                "number=$number)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Person

        if (name != other.name) return false
        if (sname != other.sname) return false
        if (email != other.email) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name?.hashCode() ?: 0
        result = 31 * result + (sname?.hashCode() ?: 0)
        result = 31 * result + (email?.hashCode() ?: 0)
        return result
    }


}
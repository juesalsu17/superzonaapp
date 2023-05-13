package com.cc.product.Api_product.persistence.entity;

import lombok.Getter;
import lombok.Setter;
import org.aspectj.weaver.ast.Or;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "tipoorden")
public class TypeOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo", nullable = false)
    private Integer idType;

    @Column(name="nombre")
    private String name;

    //ADD RELATIONSHIPS BETWEEN TABLES
    @OneToMany(mappedBy = "order")
    private List<Order> orderList;
}

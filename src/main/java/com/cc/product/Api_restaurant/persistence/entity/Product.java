package com.cc.product.Api_restaurant.persistence.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name="productos")
public class Product {
    @Id //Because this column is a primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)//'cause this key will generate automatically
    @Column(name="id_producto")//is the real column's name on DB
    private Integer idProduct;

    @Column(name="nombre")
    private String name;

    @Column(name="id_categoria")
    private Integer idCategory;

    @Column(name="precio")
    private BigDecimal price;

    @Column(name="stock")
    private Integer stock;

    @Column(name="estado")
    private Boolean state;

    @Column(name="id_insumo")
    private Integer idSupplies;

    //ADD RELATIONSHIPS BETWEEN TABLES
    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private Category category;
}

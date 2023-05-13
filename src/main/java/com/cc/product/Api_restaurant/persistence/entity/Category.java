package com.cc.product.Api_restaurant.persistence.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name="categorias")
public class Category {

    @Id //Because this column is a primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)//'cause this key will generate automatically
    @Column(name="id_categoria")//is the real column's name on DB
    private Integer idCategory;

    @Column(name="descripcion")
    private String description;

    @Column(name="nombre")
    private String name;

    //ADD RELATIONSHIPS BETWEEN TABLES
    @OneToMany(mappedBy = "category")
    private List<Product> products;

}

package com.cc.product.Api_restaurant.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "ordenes")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_orden", nullable = false)
    private Integer idOrder;

    @Column(name= "id_cliente")
    private Integer idClient;

    @Column(name="fecha")
    private LocalDateTime date;

    @Column(name="estado")
    private Boolean state;

    @Column(name="id_tipo")
    private Integer idType;

    //ADD RELATIONSHIPS BETWEEN TABLES
    @ManyToOne
    @JoinColumn(name="id_tipo",insertable = false, updatable = false)
    private TypeOrder typeOrder;

    @ManyToOne
    @JoinColumn(name="id_cliente",insertable = false,updatable = false)
    private Client client;

}
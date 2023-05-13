package com.cc.product.Api_restaurant.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "detallespedido")
public class OrderDetails {
    @EmbeddedId
    private OrderDetailsPK orderDetailsPK;

    @Column(name= "cantidad")
    private Integer quantity;

    @Column(name="precio_unidad")
    private BigDecimal unityPrice;

    @Column(name="precio_total")
    private BigDecimal total;

    @Column(name="estado")
    private Boolean state;

    //ADD RELATIONSHIPS BETWEEN TABLES
    @ManyToOne
    @JoinColumn(name="id_producto",insertable = false,updatable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name="id_order",insertable = false,updatable = false)
    private Order order;


}
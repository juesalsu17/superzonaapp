package com.cc.product.Api_product.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class OrderDetailsPK implements Serializable {

    @Column(name="id_producto")
    private Integer idProduct;

    @Column(name="id_orden" )
    private Integer idOrder;
}

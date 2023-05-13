package com.cc.product.Api_product.persistence.entity;

import lombok.Getter;
import lombok.Setter;
import org.aspectj.weaver.ast.Or;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "clientes")
public class Client {
    @Id
    @Column(name = "id_cliente", nullable = false)
    private String idClient;

    @Column(name="nombre")
    private String name;

    @Column(name="apellido")
    private String lastName;

    @Column
    private String email;

    @Column(name="celular")
    private Long phoneNumber;

    //ADD RELATIONSHIPS BETWEEN TABLES
    @OneToMany(mappedBy = "client")
    private List<Order> orders;



}
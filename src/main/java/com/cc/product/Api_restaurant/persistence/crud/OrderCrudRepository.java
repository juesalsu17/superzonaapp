package com.cc.product.Api_restaurant.persistence.crud;

import com.cc.product.Api_restaurant.persistence.entity.Order;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface OrderCrudRepository extends CrudRepository<Order,Integer> {

    List<Order> findByDateOrderByIdOrderAsc(LocalDateTime date); //get an order list by date (utils for today)
    Optional<List<Order>> findByIdClientOrderByDate( int idClient, boolean state );//get an order using id client and date and verify state is true
}

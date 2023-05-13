package com.cc.product.Api_product.persistence.crud;

import com.cc.product.Api_product.persistence.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductCrudRepository extends CrudRepository<Product,Integer> {

    List<Product> findByIdCategoryOrderByNameAsc(int idCategory);
    Optional<List<Product>> findByStockNumberLessThanAndState(int stockNumber, boolean state);

}

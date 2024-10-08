package com.application.rest.persistence;

import com.application.rest.entities.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface IProductDAO {

    List<Product> findAll();

    Optional<Product> findById(Long id);

    //manejamos query methods
    List<Product> findByPriceInRange(BigDecimal min, BigDecimal max);

    void save(Product product);

    void deleteById(Long id);
}

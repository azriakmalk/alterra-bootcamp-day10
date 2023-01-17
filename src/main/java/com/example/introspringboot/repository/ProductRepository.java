package com.example.introspringboot.repository;


import com.example.introspringboot.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {

}

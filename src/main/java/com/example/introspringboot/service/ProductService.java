package com.example.introspringboot.service;

import com.example.introspringboot.entity.Product;
import com.example.introspringboot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public Product create(Product product){
        return productRepository.save(product);
    }

    public Product findOne(Long id){
        return productRepository.findById(id).get();
    }

    public List<Product> findAll(){
        return (List<Product>) productRepository.findAll();
    }

    public void deleteOne(Long id){
        productRepository.deleteById(id);
    }

    public Product update(Product product){
        return productRepository.save(product);
    }
}

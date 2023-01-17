package com.example.introspringboot.controller;

import com.example.introspringboot.entity.Product;
import com.example.introspringboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping(path = "/v1/products")
    public List<Product> getAllProduct(){
        return (List<Product>) productService.findAll();
    }

    @GetMapping(path = "/v1/product/{id}")
    public Product getOneProduct(@PathVariable("id") Long id) {
        return productService.findOne(id);
    }
    @PostMapping(path = "/v1/product")
    public Product createProduct(@RequestBody Product product){
        return productService.create(product);
    }

    @PutMapping(path = "/v1/product")
    public Product updateProduct(@RequestBody Product product){
        return productService.update(product);
    }

    @DeleteMapping(path = "/v1/product/{id}")
    public void deleteProduct(@PathVariable("id") Long id){
        productService.deleteOne(id);
    }
}

package com.springboot.SpringBoot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.SpringBoot.repositories.ProductRepository;

@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    


}

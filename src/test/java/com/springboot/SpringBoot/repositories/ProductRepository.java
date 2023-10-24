package com.springboot.SpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.SpringBoot.models.ProductModels;

import java.util.UUID;


@Repository
public interface ProductRepository extends JpaRepository<ProductModels,UUID>{
    
}

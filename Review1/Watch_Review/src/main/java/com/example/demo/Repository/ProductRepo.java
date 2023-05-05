package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.WatchProduct;

public interface ProductRepo extends JpaRepository<WatchProduct, Integer> {

}

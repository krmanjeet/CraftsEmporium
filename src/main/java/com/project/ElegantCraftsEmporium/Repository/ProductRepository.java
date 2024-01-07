package com.project.ElegantCraftsEmporium.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ElegantCraftsEmporium.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Additional query methods if needed
}

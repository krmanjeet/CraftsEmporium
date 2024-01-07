package com.project.ElegantCraftsEmporium.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.ElegantCraftsEmporium.entity.ProductInventory;

@Repository
public interface InventoryRepository extends JpaRepository<ProductInventory, Long> {
	
	 @Query("SELECT pi FROM ProductInventory pi WHERE pi.product.productId = :productId")
	 List<ProductInventory> findByProductId(@Param("productId") Long productId);


}
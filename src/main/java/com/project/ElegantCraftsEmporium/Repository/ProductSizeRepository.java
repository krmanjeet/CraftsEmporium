package com.project.ElegantCraftsEmporium.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project.ElegantCraftsEmporium.entity.Product;
import com.project.ElegantCraftsEmporium.entity.ProductSize;
import com.project.ElegantCraftsEmporium.entity.ProductSize;
public interface ProductSizeRepository extends JpaRepository<ProductSize, Long> {
    // Additional query methods if needed
	 @Query("SELECT ps FROM ProductSize ps WHERE ps.product.productId = :productId")
	 List<ProductSize> getListByProdId(@Param("productId") Long productId);
}


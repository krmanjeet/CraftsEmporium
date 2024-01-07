package com.project.ElegantCraftsEmporium.Service;

import com.project.ElegantCraftsEmporium.entity.ProductSize;

public interface ProductSizeService {
    // Add methods as needed
    void saveProductSize(ProductSize productSize);
    
    ProductSize getProductSizeByProdId(Long productSizeId);
}
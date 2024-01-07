package com.project.ElegantCraftsEmporium.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ElegantCraftsEmporium.Repository.ProductCategoryRepository;
import com.project.ElegantCraftsEmporium.Repository.ProductRepository;
import com.project.ElegantCraftsEmporium.entity.Product;
import com.project.ElegantCraftsEmporium.entity.ProductCategory;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    public List<ProductCategory> getAllCategories() {
        return productCategoryRepository.findAll();
    }

    public void saveProduct(Product product) {
        productRepository.save(product);
    }
    
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }
    
    public Product getProductById(Long productId)
    {
    	return productRepository.getOne(productId);
    }
}

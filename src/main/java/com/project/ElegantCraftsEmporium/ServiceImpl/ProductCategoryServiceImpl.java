package com.project.ElegantCraftsEmporium.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ElegantCraftsEmporium.Repository.ProductCategoryRepository;
import com.project.ElegantCraftsEmporium.Service.ProductCategoryService;
import com.project.ElegantCraftsEmporium.Service.ProductService;
import com.project.ElegantCraftsEmporium.entity.ProductCategory;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService{

	@Autowired
	ProductCategoryRepository productCategoryRepository;
	@Override
	public List<ProductCategory> getAllCategory() {
		// TODO Auto-generated method stub
		return productCategoryRepository.findAll();
	}
	
	@Override
    public ProductCategory getProductCategoryById(Long categoryId) {
        // Use the findById method from the repository
        return productCategoryRepository.findById(categoryId).orElse(null);
    }

}

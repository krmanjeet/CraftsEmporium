package com.project.ElegantCraftsEmporium.Service;
import java.util.List;

import com.project.ElegantCraftsEmporium.entity.ProductCategory;

public interface ProductCategoryService {

	public List<ProductCategory> getAllCategory();
	
	public ProductCategory getProductCategoryById(Long id);
}

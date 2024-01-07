package com.project.ElegantCraftsEmporium.Service;

import java.util.List;

import com.project.ElegantCraftsEmporium.DTO.ProductInventoryDTO;
import com.project.ElegantCraftsEmporium.entity.ProductInventory;

public interface ProductInventoryService {

	public ProductInventory saveInventory(ProductInventory inventory) ;
	
	public List<ProductInventory> getAllInventories();
	
	public ProductInventoryDTO convertToDTO(ProductInventory productInventory);
	    
	public List<ProductInventoryDTO> convertListToDTO(List<ProductInventory> productInventoryList);
		   
}

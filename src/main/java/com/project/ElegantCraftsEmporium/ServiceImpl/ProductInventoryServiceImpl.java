package com.project.ElegantCraftsEmporium.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ElegantCraftsEmporium.DTO.ProductInventoryDTO;
import com.project.ElegantCraftsEmporium.Repository.InventoryRepository;
import com.project.ElegantCraftsEmporium.Service.ProductInventoryService;
import com.project.ElegantCraftsEmporium.entity.ProductInventory;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductInventoryServiceImpl implements ProductInventoryService{

	@Autowired
    private InventoryRepository inventoryRepository;

    
	public ProductInventory saveInventory(ProductInventory inventory) {
        return inventoryRepository.save(inventory);
    }

    public List<ProductInventory> getAllInventories() {
        return inventoryRepository.findAll();
    }

	@Override
	public ProductInventoryDTO convertToDTO(ProductInventory productInventory) {
		// TODO Auto-generated method stub
		return new ProductInventoryDTO(
                productInventory.getDate(),
                productInventory.getProduct().getProductName(),
                productInventory.getProduct().getCategory().getCategoryName(),
                productInventory.getProductSize().getSizeName(),
                productInventory.getQuantity(),
                productInventory.getPrice()
        );
	}

	@Override
	public List<ProductInventoryDTO> convertListToDTO(List<ProductInventory> productInventoryList) {
		// TODO Auto-generated method stub
		   return productInventoryList.stream()
	                .map(this::convertToDTO)
	                .collect(Collectors.toList());
	}

    // Add other service methods as needed

}

package com.project.ElegantCraftsEmporium.Controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.ElegantCraftsEmporium.DTO.InventoryRequestDTO;
import com.project.ElegantCraftsEmporium.Service.ProductInventoryService;
import com.project.ElegantCraftsEmporium.Service.ProductService;
import com.project.ElegantCraftsEmporium.Service.ProductSizeService;
import com.project.ElegantCraftsEmporium.entity.Product;
import com.project.ElegantCraftsEmporium.entity.ProductInventory;
import com.project.ElegantCraftsEmporium.entity.ProductSize;

@RestController
@RequestMapping("/CraftsEmporium//inventory")
public class ProductInventoryController {

	@Autowired
    private  ProductInventoryService productInventoryService;

	@Autowired
	private ProductService productService;
	
	@Autowired
	private ProductSizeService productSizeService;
	
	
    @PostMapping("/save")
    public ResponseEntity<String> saveInventory(
            @RequestParam Long productId,
            @RequestParam String inventorySizeName,
            @RequestParam int quantity,
            @RequestParam BigDecimal price) {

        try {
        	System.out.println("Inisde saveInventory-Start");
//        	System.out.println("inventoryRequest:"+inventoryRequest);
        	InventoryRequestDTO inventoryRequest = new InventoryRequestDTO();
        	inventoryRequest.setPrice(price);
        	inventoryRequest.setProductId(productId);
        	inventoryRequest.setQuantity(quantity);
        	inventoryRequest.setSizeId(Long.parseLong(inventorySizeName));;
            ProductInventory inventory = convertDTOToEntity(inventoryRequest);
            System.out.println("inventory"+inventory);
            // Save the inventory
            productInventoryService.saveInventory(inventory);
            System.out.println("Inisde saveInventory-End");
            return new ResponseEntity<>("Inventory saved successfully", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error saving inventory: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    private ProductInventory convertDTOToEntity(InventoryRequestDTO inventoryRequest) {
        // Implement conversion logic from DTO to Entity
        // This logic depends on the structure of your DTO and Entity classes
        // It's recommended to use a library like ModelMapper for complex conversions.
    	Product product=productService.getProductById(inventoryRequest.getProductId());
    	System.out.println("product:"+product);
    	ProductSize productSize=productSizeService.getProductSizeByProdId(inventoryRequest.getSizeId());
    	System.out.println("productSize:"+productSize);
        return new ProductInventory(product, productSize, inventoryRequest.getQuantity(),inventoryRequest.getPrice());
    }
}


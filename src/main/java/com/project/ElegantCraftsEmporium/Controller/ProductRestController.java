package com.project.ElegantCraftsEmporium.Controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.ElegantCraftsEmporium.DTO.ProductInventoryDTO;
import com.project.ElegantCraftsEmporium.Repository.InventoryRepository;
import com.project.ElegantCraftsEmporium.Repository.ProductSizeRepository;
import com.project.ElegantCraftsEmporium.Service.ProductInventoryService;
import com.project.ElegantCraftsEmporium.Service.ProductService;
import com.project.ElegantCraftsEmporium.entity.Product;
import com.project.ElegantCraftsEmporium.entity.ProductInventory;
import com.project.ElegantCraftsEmporium.entity.ProductSize;

@RestController
public class ProductRestController {
	
	@Autowired
	private  ProductService productService;
    
	@Autowired
	private ProductSizeRepository productSizeRepository;
	
	
	@Autowired
	private InventoryRepository inventoryRepository;
	
	@Autowired
	private  ProductInventoryService productInventoryService;
	
	@GetMapping("/CraftsEmporium/product/getProduct")
	@ResponseBody
	public Product getProductById(@RequestParam String productId) {
		try
		{
			System.out.println("productId:"+productId);
			List<Product> list=productService.getAllProduct();
			Product product=null;
			for(Product p:list)
			{
				if(p.getProductId()==Long.parseLong(productId))
				{
					product=productService.getProductById(Long.parseLong(productId));
					break;
				}
				
			}
			return product;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
				
	}
	
	@GetMapping("/CraftsEmporium/product/getProductSize")
	@ResponseBody
	public List<ProductSize> getProductSizeById(@RequestParam String productId) {
		try
		{
			List<ProductSize> list=productSizeRepository.getListByProdId(Long.parseLong(productId));
			return list;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
				
	}
	
	@GetMapping("/CraftsEmporium/product/productHistory")
	@ResponseBody
	public List<ProductInventoryDTO> getProductHistoryById(@RequestParam String productId) {
		try
		{
			List<ProductInventory> productInventoryList=inventoryRepository.findByProductId(Long.parseLong(productId));
			List<ProductInventoryDTO> productInventoryDTO=productInventoryService.convertListToDTO(productInventoryList);
			return productInventoryDTO;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
				
	}
}

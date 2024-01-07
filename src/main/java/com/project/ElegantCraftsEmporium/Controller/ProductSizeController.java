package com.project.ElegantCraftsEmporium.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.ElegantCraftsEmporium.Service.ProductService;
import com.project.ElegantCraftsEmporium.Service.ProductSizeService;
import com.project.ElegantCraftsEmporium.entity.Product;
import com.project.ElegantCraftsEmporium.entity.ProductSize;

@Controller
@RequestMapping("/CraftsEmporium/")
public class ProductSizeController {

	@Autowired 
	ProductService productService;
	
	@Autowired
	ProductSizeService productSizeService;
	
	@PostMapping("/addItemDetails")
	public String addItemDetails(@ModelAttribute ProductSize productSize, @RequestParam("productId") Long productId) {

		Product selectedProduct = productService.getProductById(productId);
		productSize.setProduct(selectedProduct);
		productSizeService.saveProductSize(productSize);

		return "add_product_details"; // Redirect to a new page after saving
	}
	
}

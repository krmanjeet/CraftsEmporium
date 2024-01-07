package com.project.ElegantCraftsEmporium.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.ElegantCraftsEmporium.Repository.ProductCategoryRepository;
import com.project.ElegantCraftsEmporium.Service.ProductCategoryService;
import com.project.ElegantCraftsEmporium.Service.ProductService;
import com.project.ElegantCraftsEmporium.entity.ProductCategory;
@Controller
public class HomeController {

	 
	
	 
       
    @GetMapping("/CraftsEmporium/")
    public String getIndexPage() {
        return "index"; // returns the logical view name (index.jsp)
    }
    
    @GetMapping("/CraftsEmporium/productPreview")
    public String getSignUp() {
        return "product_preview"; // returns the logical view name (index.jsp)
    }
    
    @GetMapping("/CraftsEmporium/admin")
    public String addItem(Model model) {
    	 
        return "admin_dashboard"; // returns the logical view name (index.jsp)
    }
    
    @GetMapping("/CraftsEmporium/addItemDetails")
    public String addItemDetails(Model model) {
    	 
        return "add_product_details"; // returns the logical view name (index.jsp)
    }
    
    @GetMapping("/CraftsEmporium/updateInventory")
    public String addInInventory(Model model) {
    	 
        return "add_product_inventory"; // returns the logical view name (index.jsp)
    }
    
    
    
    
}


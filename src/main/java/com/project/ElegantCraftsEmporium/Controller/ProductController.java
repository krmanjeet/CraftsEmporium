package com.project.ElegantCraftsEmporium.Controller;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.project.ElegantCraftsEmporium.Service.ProductCategoryService;
import com.project.ElegantCraftsEmporium.Service.ProductService;
import com.project.ElegantCraftsEmporium.entity.Product;
import com.project.ElegantCraftsEmporium.entity.ProductCategory;

@Controller
@RequestMapping("/CraftsEmporium/")
public class ProductController {

	
	@Value("${local.repository.path}")
    private String localRepositoryPath;
	
	@Autowired
	private ProductCategoryService productCategoryService;
	
	private final ProductService productService;
    
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/api/categories")
    @ResponseBody
    public List<ProductCategory> getAllCategories() {
        return productService.getAllCategories();
    }
    
    @GetMapping("/api/productList")
    @ResponseBody
    public List<Product> getAllProduct() {
        return productService.getAllProduct();
    }
    
   
    
    @PostMapping("/addProduct")
    public String addProduct(@RequestParam("productName") String productName,
                             @RequestParam("description") String description,
                             @RequestParam("file") MultipartFile file,
                             @RequestParam("categoryId") String categoryId) {
        try {
        	
        	 String filename = "";
        	
            Product product = new Product();
            product.setProductName(productName);
            product.setDescription(description);

   
            if (!file.isEmpty()) {
                filename = file.getOriginalFilename();
                // Change this path to the directory where you want to store the images
                String uploadDirectory = localRepositoryPath;
                System.out.printf("localRepositoryPath:"+localRepositoryPath);
                byte[] bytes = file.getBytes();
                Path path = Paths.get(uploadDirectory + filename);
                Files.write(path, bytes);
                filename = localRepositoryPath+file.getOriginalFilename();
//                product.setProductImage(file.getBytes());
            }
            // Assuming you have a method to retrieve the category by ID
            
            System.out.println("categoryId:"+categoryId);
            ProductCategory category = productCategoryService.getProductCategoryById(Long.parseLong(categoryId));
            product.setCategory(category);
            product.setImage(filename);
            productService.saveProduct(product);

        } catch (Exception e) {
            // Handle errors
            e.printStackTrace();
        }

        return "add_product_details";
    }

}

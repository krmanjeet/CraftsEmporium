package com.project.ElegantCraftsEmporium.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ElegantCraftsEmporium.Repository.ProductSizeRepository;
import com.project.ElegantCraftsEmporium.Service.ProductSizeService;
import com.project.ElegantCraftsEmporium.entity.ProductSize;

@Service
public class ProductSizeServiceImpl implements ProductSizeService {

    @Autowired
    private ProductSizeRepository productSizeRepository; // Assuming you have ProductSizeRepository

    @Override
    public void saveProductSize(ProductSize productSize) {
        productSizeRepository.save(productSize);
    }

	@Override
	public ProductSize getProductSizeByProdId(Long productSizeId) {
		for(ProductSize p:productSizeRepository.findAll())
		{
			if(p.getSizeId()==productSizeId)
			{
				return p;
							}
			
		}
		return null;
	}
}
package com.project.ElegantCraftsEmporium.entity;

import java.math.BigDecimal;

import javax.persistence.*;

@Entity
@Table(name = "ProductSize")
public class ProductSize {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "size_id")
    private Long sizeId;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(name = "size_name")
    private String sizeName;

    @Column(name = "weight")
    private String weight;


    @Column(name = "dimensions")
    private String dimensions;

    
    
	public ProductSize() {
		super();
	}



	public ProductSize(Long sizeId, Product product, String sizeName, String weight, String dimensions) {
		super();
		this.sizeId = sizeId;
		this.product = product;
		this.sizeName = sizeName;
		this.weight = weight;
		this.dimensions = dimensions;
	}



	public Long getSizeId() {
		return sizeId;
	}



	public void setSizeId(Long sizeId) {
		this.sizeId = sizeId;
	}



	public Product getProduct() {
		return product;
	}



	public void setProduct(Product product) {
		this.product = product;
	}



	public String getSizeName() {
		return sizeName;
	}



	public void setSizeName(String sizeName) {
		this.sizeName = sizeName;
	}



	public String getWeight() {
		return weight;
	}



	public void setWeight(String weight) {
		this.weight = weight;
	}



	public String getDimensions() {
		return dimensions;
	}



	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}

	
	    
}

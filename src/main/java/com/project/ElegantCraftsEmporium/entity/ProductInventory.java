package com.project.ElegantCraftsEmporium.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "ProductInventory")
public class ProductInventory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "inventory_id")
	private Long inventoryId;

	@ManyToOne
	@JoinColumn(name = "product_id", nullable = false)
	private Product product;

	@ManyToOne
	@JoinColumn(name = "size_id", nullable = false)
	private ProductSize productSize;

	@Column(name = "quantity")
	private int quantity;

	@Column(name = "price")
	private BigDecimal price;

	@Column(name = "date")
	private LocalDate date;


	@PrePersist
	public void prePersist() {
		date = LocalDate.now();
	}

	public ProductInventory() {
		super();
	}

	public ProductInventory(Product product, ProductSize productSize, int quantity, BigDecimal price) {
		super();
		this.product = product;
		this.productSize = productSize;
		this.quantity = quantity;
		this.price = price;
	}
	public ProductInventory(Long inventoryId, Product product, ProductSize productSize, int quantity, BigDecimal price,
			LocalDate date) {
		super();
		this.inventoryId = inventoryId;
		this.product = product;
		this.productSize = productSize;
		this.quantity = quantity;
		this.price = price;
		this.date = date;
	}

	public Long getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(Long inventoryId) {
		this.inventoryId = inventoryId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public ProductSize getProductSize() {
		return productSize;
	}

	public void setProductSize(ProductSize productSize) {
		this.productSize = productSize;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}

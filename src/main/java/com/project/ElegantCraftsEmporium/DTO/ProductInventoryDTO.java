package com.project.ElegantCraftsEmporium.DTO;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProductInventoryDTO {

    private LocalDate date;
    private String productName;
    private String categoryName;
    private String sizeName;
    private int quantity;
    private BigDecimal pricePerPiece;

    // Constructors, getters, and setters go here

    
    public ProductInventoryDTO(LocalDate date, String productName, String categoryName, String sizeName, int quantity, BigDecimal pricePerPiece) {
        this.date = date;
        this.productName = productName;
        this.categoryName = categoryName;
        this.sizeName = sizeName;
        this.quantity = quantity;
        this.pricePerPiece = pricePerPiece;
    }

    // Add constructors, getters, and setters as needed

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getSizeName() {
        return sizeName;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPricePerPiece() {
        return pricePerPiece;
    }

    public void setPricePerPiece(BigDecimal pricePerPiece) {
        this.pricePerPiece = pricePerPiece;
    }
}

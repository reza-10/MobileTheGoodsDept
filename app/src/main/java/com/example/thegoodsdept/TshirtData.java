package com.example.thegoodsdept;

public class TshirtData {
    private String ProductName;
    private String ProductPrice;
    private String ProductImage;

    public TshirtData(){

    }

    public TshirtData(String productName, String productPrice, String productImage) {
        ProductName = productName;
        ProductPrice = productPrice;
        ProductImage = productImage;
    }

    public String getProductName() {
        return ProductName;
    }

    public String getProductPrice() {
        return ProductPrice;
    }

    public String getProductImage() {
        return ProductImage;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public void setProductPrice(String productPrice) {
        ProductPrice = productPrice;
    }

    public void setProductImage(String productImage) {
        ProductImage = productImage;
    }
}

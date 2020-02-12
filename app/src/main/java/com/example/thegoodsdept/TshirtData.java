package com.example.thegoodsdept;

public class TshirtData {
    private String ProductName;
    private String ProductPrice;
    private int ProductImage;

    public TshirtData(){

    }

    public TshirtData(String productName, String productPrice, int productImage) {
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

    public int getProductImage() {
        return ProductImage;
    }
}

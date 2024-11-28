/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author cesararcras
 */
public class Product {
    private String name;
    private String description;
    private float supplierPrice;
    private float salePrice;
    private int category;
    private String color;

    public Product(String productName, String productDescription, float productSupplierPrice, float productSalePrice, int productCategory, String productColor) {
        this.name = productName;
        this.description = productDescription;
        this.supplierPrice = productSupplierPrice;
        this.salePrice = productSalePrice;
        this.category = productCategory;
        this.color = productColor;
    }
}

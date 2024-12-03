package model;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getSupplierPrice() {
        return supplierPrice;
    }

    public void setSupplierPrice(float supplierPrice) {
        this.supplierPrice = supplierPrice;
    }

    public float getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(float salePrice) {
        this.salePrice = salePrice;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Product{");
        sb.append("name= ").append(name);
        sb.append(", description= ").append(description);
        sb.append(", supplierPrice= ").append(supplierPrice);
        sb.append(", salePrice= ").append(salePrice);
        sb.append(", category= ").append(category);
        sb.append(", color= ").append(color);
        sb.append('}');
        return sb.toString();
    }
}

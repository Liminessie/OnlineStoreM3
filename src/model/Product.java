package model;

public class Product {
    private int productID;  
    private String name;
    private String description;
    private float supplierPrice;
    private float salePrice;
    private int category;
    private String color;
    private boolean stock;
    private int unit;

    public Product() {
        
    }

    public Product(int productID, String productName, String productDescription, float productSupplierPrice, float productSalePrice, int productCategory, String productColor, boolean productStock, int productUnit) {
        this.productID = productID;
        this.name = productName;
        this.description = productDescription;
        this.supplierPrice = productSupplierPrice;
        this.salePrice = productSalePrice;
        this.category = productCategory;
        this.color = productColor;
        this.stock = productStock;
        this.unit = productUnit;
    }

    public int getID(){
        return productID;
    }    
    
    public void setID(int id) {
        this.productID = id;
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

    public boolean isStock() {
        return stock;
    }

    public void setStock(boolean stock) {
        this.stock = stock;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }
    
    @Override
    public String toString() {
        return String.format("Producto [ID: %d, Nombre: %s, Descripción: %s, Precio Proveedor: %.2f, Precio de Venta: %.2f, Categoría: %d, Color: %s, Stock Disponible: %b, Unidades: %d]",
                             productID, name, description, supplierPrice, salePrice, category, color, stock, unit);
    }
}


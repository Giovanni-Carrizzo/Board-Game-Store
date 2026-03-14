package boardGameStore;
	
public  abstract class Product {
	/*
	 Abstract representation of a product sold by the store.
	This class defines the common properties shared by all product types, 
	including identifier, name, purchase cost, stock quantity, and sale price. 
	Concrete subclasses represent specific categories of products.
	*/
	private int productId;
	private ProductCategory productCategory;
	private String productName;
	private double purchaseCost;
	private int quantityInStock;
	private double price;
	
	public Product(int prodId, ProductCategory prodCat, String prodName, double cost, int quantity, double prodPrice) {
		this.productId = prodId;
		this.productCategory = prodCat;
		this.productName = prodName;
		this.purchaseCost = cost;
		this.quantityInStock = quantity;
		this.price = prodPrice;
		
	}
	
	public int getProductId() {
		return this.productId;
	}
	
	public ProductCategory getProductCategory() {
		return this.productCategory;
	}
	
	public String getProductName() {
		return this.productName;
	}
	
	public double getPurchaseCost() {
		return this.purchaseCost;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int getQuantityInStock() {
		return this.quantityInStock;
	}
	
	public void setQuantityInStock(int newQuantity) {
		this.quantityInStock = newQuantity;
	}
	
	public abstract String toString();
}

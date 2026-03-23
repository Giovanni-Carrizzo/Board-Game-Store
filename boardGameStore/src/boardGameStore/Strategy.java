package boardGameStore;

public class Strategy extends Product {
	
	/*
	 Represents a strategy board game which the user can buy
	 */
	public Strategy(int prodId, String prodName, double cost, int quantity, double prodPrice) {
		super(prodId, ProductCategory.BOARDGAME, prodName, cost, quantity, prodPrice);
		
	}

	@Override
	public String toString() {
		return this.getProductId()+";"+this.getProductCategory()+"; strategy;"+this.getProductName()+";"
				+this.getQuantityInStock()+";"+this.getPurchaseCost();
	}

}

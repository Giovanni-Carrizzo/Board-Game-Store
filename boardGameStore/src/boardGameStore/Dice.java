package boardGameStore;

public class Dice extends Product {

	public Dice(int prodId, ProductCategory prodCat, String prodName, double cost, int quantity, double prodPrice) {
		super(prodId, prodCat, prodName, cost, quantity, prodPrice);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getProductId()+";"+this.getProductCategory()+"; dice;"+this.getProductName()+";"
		+this.getQuantityInStock()+";"+this.getPurchaseCost();
	}

}

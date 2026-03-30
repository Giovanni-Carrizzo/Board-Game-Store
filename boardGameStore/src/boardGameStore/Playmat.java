package boardGameStore;

public class Playmat extends Product {

	public Playmat(int prodId, ProductCategory prodCat, String prodName, double cost, int quantity, double prodPrice) {
		super(prodId, prodCat, prodName, cost, quantity, prodPrice);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return this.getProductId()+";"+this.getProductCategory()+"; playmat;"+this.getProductName()+";"
				+this.getQuantityInStock()+";"+this.getPurchaseCost();
	}

}

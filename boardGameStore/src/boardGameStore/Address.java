package boardGameStore;

public class Address {
	//Class represents an address, made up of a number and a post code
	private int number;
	private String postcode;
	
	public Address(int numInp, String postcodeInp) {
		this.number = numInp;
		this.postcode = postcodeInp;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public String getPostcode() {
		return this.postcode;
	}
	
	public String toString() {
		return "<"+ this.getNumber()+"> <"+this.getPostcode();
	}
}

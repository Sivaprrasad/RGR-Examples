
public class SoftwareSales {
	
	public double calculatePrice(int quantity) {
		if(quantity >= 10 && quantity <=99) {
			int subtotal = quantity * 99;
			double discount = subtotal * 0.20;
			double finalPrice = subtotal - discount;
			return finalPrice;
		}
		return 99;
		
	}

}

import java.util.List;

import controller.ShopperHelper;
import model.Shopper;

/**
 * @author Kenneth Nimmo - Knimmo
 * CIS175 - Fall 2021
 * Oct 2, 2023
 */
public class ShoppingTester {

	public static void main(String[] args) {
		Shopper bill = new Shopper("Bill");
		Shopper jim = new Shopper("Jim");
		ShopperHelper sh = new ShopperHelper();
		
		sh.insertShopper(bill);
		sh.insertShopper(jim);
		
		List<Shopper> allShopper = sh.showAllShopper();
		
		for(Shopper a: allShopper) {
			System.out.println(a.toString());
		}
	}

}

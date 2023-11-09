import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import controller.ListDetailsHelper;
import controller.ShopperHelper;
import model.ListDetails;
import model.ListItem;
import model.Shopper;

/**
 * @author Kenneth Nimmo - Knimmo
 * CIS175 - Fall 2021
 * Oct 2, 2023
 */
public class ListDetailsTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shopper cameron = new Shopper("Cameron");
		
		ListDetailsHelper ldh = new ListDetailsHelper();
		
		ListItem shampoo = new ListItem("Target", "Shampoo");
		ListItem brush = new ListItem("Target", "Brush");
		
		List<ListItem> cameronsItems = new ArrayList<ListItem>();
		cameronsItems.add(shampoo);
		cameronsItems.add(brush);
		
		ListDetails cameronsList = new ListDetails("Cameron's ShoppingList", LocalDate.now(), cameron);
		cameronsList.setListOfItems(cameronsItems);
		
		ldh.insertNewListDetails(cameronsList);
		
		List<ListDetails> allLists = ldh.getLists();
		
		for(ListDetails a : allLists) {
			System.out.println(a.toString());
		}
	}

}

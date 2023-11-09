package model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @author Kenneth Nimmo - Knimmo
 * CIS175 - Fall 2021
 * Oct 2, 2023
 */

@Entity
public class ListDetails {
	@Id
	@GeneratedValue
	private int id;
	private String listName;
	private LocalDate tripDate;
	@ManyToOne (cascade=CascadeType.PERSIST)
	private Shopper shopper;
	@OneToMany(cascade=CascadeType.MERGE, fetch=FetchType.EAGER)
	private List<ListItem> listOfItems;
	
	/**
	 * 
	 */
	public ListDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param listName
	 * @param tripDate
	 * @param shopper
	 * @param listOfItems
	 */
	public ListDetails(int id, String listName, LocalDate tripDate, Shopper shopper, List<ListItem> listOfItems) {
		super();
		this.id = id;
		this.listName = listName;
		this.tripDate = tripDate;
		this.shopper = shopper;
		this.listOfItems = listOfItems;
	}

	/**
	 * @param listName
	 * @param tripDate
	 * @param shopper
	 * @param listOfItems
	 */
	public ListDetails(String listName, LocalDate tripDate, Shopper shopper, List<ListItem> listOfItems) {
		super();
		this.listName = listName;
		this.tripDate = tripDate;
		this.shopper = shopper;
		this.listOfItems = listOfItems;
	}

	/**
	 * @param listName
	 * @param tripDate
	 * @param shopper
	 */
	public ListDetails(String listName, LocalDate tripDate, Shopper shopper) {
		super();
		this.listName = listName;
		this.tripDate = tripDate;
		this.shopper = shopper;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the listName
	 */
	public String getListName() {
		return listName;
	}

	/**
	 * @param listName the listName to set
	 */
	public void setListName(String listName) {
		this.listName = listName;
	}

	/**
	 * @return the tripDate
	 */
	public LocalDate getTripDate() {
		return tripDate;
	}

	/**
	 * @param tripDate the tripDate to set
	 */
	public void setTripDate(LocalDate tripDate) {
		this.tripDate = tripDate;
	}

	/**
	 * @return the shopper
	 */
	public Shopper getShopper() {
		return shopper;
	}

	/**
	 * @param shopper the shopper to set
	 */
	public void setShopper(Shopper shopper) {
		this.shopper = shopper;
	}

	/**
	 * @return the listOfItems
	 */
	public List<ListItem> getListOfItems() {
		return listOfItems;
	}

	/**
	 * @param listOfItems the listOfItems to set
	 */
	public void setListOfItems(List<ListItem> listOfItems) {
		this.listOfItems = listOfItems;
	}

	@Override
	public String toString() {
		return "ListDetails [id=" + id + ", listName=" + listName + ", tripDate=" + tripDate + ", shopper=" + shopper
				+ ", listOfItems=" + listOfItems + "]";
	}
	
	

}

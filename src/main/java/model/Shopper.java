package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Kenneth Nimmo - Knimmo
 * CIS175 - Fall 2021
 * Oct 2, 2023
 */

@Entity
@Table(name="shopper")
public class Shopper {
	
	@Id
	@GeneratedValue
	private int id;
	private String shopperName;
	
	/**
	 * 
	 */
	public Shopper() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @param name
	 */
	public Shopper(String name) {
		super();
		this.shopperName = name;
	}

	/**
	 * @param id
	 * @param shopperName
	 */
	public Shopper(int id, String shopperName) {
		super();
		this.id = id;
		this.shopperName = shopperName;
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
	 * @return the shopperName
	 */
	public String getShopperName() {
		return shopperName;
	}

	/**
	 * @param shopperName the shopperName to set
	 */
	public void setShopperName(String shopperName) {
		this.shopperName = shopperName;
	}

	@Override
	public String toString() {
		return "Shopper [id=" + id + ", shopperName=" + shopperName + "]";
	}
	
	

}

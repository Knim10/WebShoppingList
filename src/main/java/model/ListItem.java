package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Kenneth Nimmo - Knimmo
 * CIS175 - Fall 2021
 * Sep 12, 2023
 */

@Entity
@Table(name="items")
public class ListItem {
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	@Column(name="STORE")
	private String store;
	@Column(name="ITEM")
	private String item;
	
	public ListItem() {
		super();
	}
	
	public ListItem(String store, String item) {
		super();
		this.store = store;
		this.item = item;
	}
	
	public void setStore(String store) {
		this.store = store;
	}
	
	public void setItem(String item) {
		this.item = item;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getStore() {
		return this.store;
	}
	
	public String getItem() {
		return this.item;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String returnItemDetails() {
		return this.store + ": " + this.item;
	}

	@Override
	public String toString() {
		return "[store=" + store + ", item=" + item + "]";
	}

}

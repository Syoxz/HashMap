package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@ElementCollection
    @CollectionTable(name = "order_item_mapping", 
      joinColumns = {@JoinColumn(name = "order_id", referencedColumnName = "id")})
    @MapKeyColumn(name = "item_name")
    @Column(name = "price")
    private Map <String, Item> itemPriceMap;

	public Map<String, Item> getItemPriceMap() {
		return itemPriceMap;
	}

	public void setItemPriceMap(Map<String, Item> itemPriceMap) {
		this.itemPriceMap = itemPriceMap;
	}


	
	
	
	
}

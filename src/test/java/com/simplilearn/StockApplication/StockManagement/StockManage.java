package com.simplilearn.StockApplication.StockManagement;

import java.util.HashMap;

public class StockManage<Product> {
  int  ProductId;
	HashMap<Integer,Product> product=new HashMap<Integer, Product>();
	
	
	public Product searchProduct(int searchProductId) {
		return product.getOrDefault(searchProductId, null);
	}
	public void displayInventory() {
		System.out.println("Inventory :");
		for(Product product:product.values()) {
			System.out.println(product);
			
		}
	}
	public void searchProduct(ProductCheck p1) {
		// TODO Auto-generated method stub
		
	}
}


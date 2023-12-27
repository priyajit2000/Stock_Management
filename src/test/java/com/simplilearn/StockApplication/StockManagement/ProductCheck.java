package com.simplilearn.StockApplication.StockManagement;

public class ProductCheck {
	int ProductId;
	String ProductName;
	int ProductQuantity;
	
	public ProductCheck (int productId, String productName, int productQuantity) {
		super();
		ProductId = productId;
		ProductName = productName;
		ProductQuantity = productQuantity;
	}
	
	@Override
	public String toString() {
		return "Product [ProductId=" + ProductId + ", ProductName=" + ProductName + ", ProductQuantity=" + ProductQuantity + "]";
	}

	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getProductQuantity() {
		return ProductQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		ProductQuantity = productQuantity;
	}
	
}


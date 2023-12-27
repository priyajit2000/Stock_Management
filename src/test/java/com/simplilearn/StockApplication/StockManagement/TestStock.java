package com.simplilearn.StockApplication.StockManagement;

//public class TestStock {

//}

//package com.simplilearn.testng.Test;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//import package com.simplilearn.StockApplication.StockManagement.StockManage;

public class TestStock {
	@SuppressWarnings("rawtypes")
	private StockManage stockManager;
    private ProductCheck p1;
    private ProductCheck p2;
    private ProductCheck p3;
    private ProductCheck p4;
    private ProductCheck p5;
    private ProductCheck p6;

    @SuppressWarnings("rawtypes")
	@BeforeMethod
    public void setUp() {
        stockManager = new StockManage();
         p1=new ProductCheck(1,"Laptops",20);
		 p2=new ProductCheck(2,"MObiles",29);
         p3=new ProductCheck(3,"Snacks",58);
		
         p4=new ProductCheck(4,"Shirts",78);
		 p5=new ProductCheck(5,"Sarees",93);
		 p6=new ProductCheck(6,"Books",72);

        stockManager.searchProduct(p1);
        stockManager.searchProduct(p2);
        stockManager.searchProduct(p3);
        stockManager.searchProduct(p4);
        stockManager.searchProduct(p5);
        stockManager.searchProduct(p6);
    }

    @Test
    public void testSearchProductExists() {
        int searchProductId = 1;
        ProductCheck searchedProduct = (ProductCheck) stockManager.searchProduct(searchProductId);

        assertNotNull(searchedProduct);
        assertEquals(searchProductId, searchedProduct.getProductId());
    }

    @Test
    public void testSearchProductNotExists() {
        int searchProductId = 9; 
        ProductCheck searchedProduct = (ProductCheck) stockManager.searchProduct(searchProductId);

        assertNull(searchedProduct);
    }

  

}

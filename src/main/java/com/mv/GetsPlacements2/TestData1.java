package com.mv.GetsPlacements2;

import org.testng.annotations.DataProvider;

/**
 * @author Akash
 *
 */
public class TestData1 {

	@DataProvider(name = "InputData")
	public Object[][] getDataforEditField() {
		// 2 sets of data
		return new Object[][] {

				{ new Helper("29e2b7a0") } };
	}

}

class Helper {
	Helper(String data1) {
		this.token1 = data1;
		//this.token2 = data2;
		//this.token3 = data3;
	}

	String token1;
	//String token2;
	//String token3;

}

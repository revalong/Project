package com.fmt;

public class Equipment extends Item{
	private Purchase p;
	private Lease l;

	
	
	
	public Equipment(String code, String type, String name, String model) {
		super(code,type,name,model);
		
	}



	public Equipment(double price, String date1, String date2) {
		super(price,date1,date2);
		
	}



	public Equipment(double price, String itemCode) {
		super(price,itemCode);
	}



}
package com.fmt;

public class Product extends Item{
	private int unitsPurchased;

	public Product(String code,  String name, String unit, String unitPrice) {
		super(code,name,unit,Double.parseDouble(unitPrice));
	
	}
	

	public double getSubTotalPay() {
		return super.getUnitPrice()*unitsPurchased;
	}
	public double getTotalPay() {
		return getSubTotalPay()-getTaxes();
	}
	
	public double getTaxes() {
	
		return 0.0715*getSubTotalPay();
	}


	public String getCode() {
		return super.getCode();
	}


	public String getName() {
		return super.getName();
	}


	public String getUnit() {
		return super.getUnit();
	}
	
	

}
package com.fmt;

public class Item implements FarMartItem{
	private String type;
	
	private transient String code;
	private transient String name;
	private transient String unit; 
	private transient double unitPrice;
	private transient String model;
	private transient double hourlyRate;
	private double price;
	private String date1;
	private String date2;

	private Product product;
	
//class to create items objects
	
	public Item(String code, String type, String name, String model){
		this.code=code;
		this.type=type;
		this.name=name;
		this.model=model;
		
	}
	public String getCode() {
		return code;
	}
	public Item(String code, String type, String name, String unit, String unitPrice) {
		this.code=code;
		this.type= type;
		this.product=new Product(code,name,unit,unitPrice);
	}
	public String getName() {
		return name;
	}
	public String getUnit() {
		return unit;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public String getModel() {
		return model;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public double getPrice() {
		return price;
	}
	public String getDate1() {
		return date1;
	}
	public String getDate2() {
		return date2;
	}
	

	public Item(String code, String name, String unit, double unitPrice) {
		this.code=code;
		this.name=name;
		this.unit=unit;
		this.unitPrice=unitPrice;
	}
	public Item(String code, String type, String name, double hourlyRate, String type1) {
		this.type=type1;
		this.code=code;
		this.name=name;
		this.hourlyRate=hourlyRate;
		
	}
	public Item(double price, String date1, String date2) {
		this.price=price;
		this.date1=date1;
		this.date2=date2;
	}
	public Item(double price2, String itemCode) {
		this.price=price2;
		this.code=itemCode;
	}
	public String getType() {
		return type;
	}

	public String toString() {
		return type;
	}
	@Override
	public double getTaxes() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getSubTotalPay() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getTotal() {
		// TODO Auto-generated method stub
		return 0;
	}
	

} 
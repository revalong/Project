package com.fmt;

public class Service extends Item{
	private int numHours;
	
	
	
	public Service(String code, String type, String name, String hourlyRate) {
		super(code,type,name,Double.parseDouble(hourlyRate), "S");
			}
	
	public double getTaxes() {
		return super.getHourlyRate() *numHours*.0345;
	}


	public double getTotalPay() {
		return getSubTotalPay()-getTaxes();
	}

	public double getSubTotalPay() {
		return super.getHourlyRate()*numHours;
	}

	public String getCode() {
		return super.getCode();
	}

	public String getType() {
		return super.getType();
	}

	public String getName() {
		return super.getName();
	}
	

}
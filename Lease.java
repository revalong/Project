package com.fmt;

import java.time.LocalDate;
import java.time.Period;
import java.time.LocalDate;

public class Lease extends Equipment{

	
	public Lease(double price, String date1, String date2) {
		super(price, date1, date2);
	
	}
	
	public double getSubTotalPay() {
		return super.getPrice();
	}
	public double getTotalPay() {
		return super.getPrice()-(((int)(lengthOfTime()/30))*getTaxes());
	}
	public double lengthOfTime() {
		return Period.between(LocalDate.parse(super.getDate1()), LocalDate.parse(super.getDate2())).getDays();
		
	}


	public double getTaxes() {
		if(super.getPrice()<10000) {
			return super.getPrice();
		}
		else if(super.getPrice()>10000 && super.getPrice()<100000){
			return super.getPrice()+500;
		}
		else {
			return super.getPrice() + 1500;
		}
	}

	

}






package com.fmt;

public class Invoice {
	
	private Store s;
	private String invoice;
	private Person customer;
	private Person salesPerson;
	private String date;
	
	public Invoice(String invoiceCode) {
		this.invoice=invoiceCode;
	}


	public Invoice(String invoice, Store c, Person customer, Person salesPerson, String date) {
		this.invoice = invoice;
		this.s=c;
		this.customer=customer;
		this.salesPerson=salesPerson;
		this.date=date;
	}


	public Store getS() {
		return s;
	}


	public String getInvoice() {
		return invoice;
	}


	public Person getCustomer() {
		return customer;
	}


	public Person getSalesPerson() {
		return salesPerson;
	}


	public String getDate() {
		return date;
	}
	
	public String toString() {
		return invoice + "  " + s.getCode() + "  " + customer.getLastName() + ", " + customer.getFirstName();
	}
	
	

	}



	
	
	


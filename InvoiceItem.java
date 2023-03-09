package com.fmt;

public class InvoiceItem extends Item{
	private String invoiceCode;
	private String itemCode;
	private Equipment e;
	private double quantity;
	private Item i;
	private double fee;
	private double price;
	
	public InvoiceItem(String invoiceCode, String itemCode, String equipment, String price) {
		this.invoiceCode = invoiceCode;
		this.e = new Equipment(itemCode, equipment, price);
	}
	public InvoiceItem() {
		
	}
	public InvoiceItem(String invoiceCode, String itemCode, String quantity) {
		this.invoiceCode=invoiceCode;
		this.itemCode=itemCode;
		this.quantity=Double.parseDouble(quantity);
	}
	public InvoiceItem(String invoiceCode, String itemCode, String equipment,String price, String startDate, String endDate) {
		this.invoiceCode=invoiceCode;
		this.e = new Equipment(itemCode, equipment, price, startDate, endDate);
	}
	public InvoiceItem(String invoiceCode, Item q, String quantity) {
		this.invoiceCode=invoiceCode;
		this.i=q;
		this.quantity= Double.parseDouble(quantity);
	}
	public InvoiceItem(String invoiceCode, Item q, String fee, String price) {
		this.invoiceCode=invoiceCode;
		this.i=q;
		this.fee=Double.parseDouble(fee);
		this.price=Double.parseDouble(price);
	}
	
	
	
}

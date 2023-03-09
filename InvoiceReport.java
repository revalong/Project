package com.fmt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class InvoiceReport extends DataConverter{
private static ArrayList<Store> st;
private static ArrayList<Item> it;
private static ArrayList<Person> per;
private static ArrayList<Invoice> invoice;
private static ArrayList<InvoiceItem> invoiceItem;
	
	public InvoiceReport() {
		
	}

		
public static void main(String[] args) throws FileNotFoundException {
	reportFiles();
	System.out.println("+----------------------------------------------------------------------------------------+\n| Summary Report - By Total                                                              |\n+----------------------------------------------------------------------------------------+");					System.out.println("\n"
						+ "Invoice #  Store      Customer           Num Items          Tax       Total");
				for(int i =0; i<invoice.size();i++) {
					System.out.print(invoice.get(i).getInvoice());
					System.out.print("       " + invoice.get(i).getS());
					System.out.print("     " + invoice.get(i).getCustomer());
					System.out.println();
						
				}
				}
				
				
			public static void reportFiles() throws FileNotFoundException{
				st = DataConverter.addStore();
				it= DataConverter.addItem();
				per = DataConverter.addPeople();
				invoice = new ArrayList<Invoice>();
				invoiceItem = new ArrayList<InvoiceItem>();
				String[] filenames = new String[2];
				filenames[0] = "data/Invoices.csv";
				filenames[1] = "data/InvoiceItems.csv";
				for(String s : filenames) {
					try (Scanner p = new Scanner(new File(s))) {
						int n = Integer.parseInt(p.nextLine());
						for(int i =0;i<n;i++) {
							String line=p.nextLine();
							String[] t = line.split(",");
							if(s.equals("data/Invoices.csv")) {
								Store c = new Store();
								Person customer = null;
								Person salesPerson = null;
								for(int j = 0;j<st.size();j++) {
									if(st.get(j).getCode().equals(t[1]))
										c=st.get(j);
								}
								for(int k =0; k<per.size();k++) {
									if(per.get(k).getCode().equals(t[2])) 
										customer = per.get(k);
									if(per.get(k).getCode().equals(t[3]))
										salesPerson = per.get(k);
								}
								invoice.add(new Invoice(t[0], c, customer, salesPerson,t[4]));
							}
							else {
								Item q= null;
								String type="";
								for(int b=0;b<it.size();b++) {
									if(t[1].equals(it.get(b).getCode())) {
										q=it.get(b);
										type=it.get(b).getType();
									}							
								}
								if(type.equals("P")){
									invoiceItem.add(new InvoiceItem(t[0],q, t[2]));
								}
								
								if(type.equals("E")){
									if(t[2].equals("P"))
										invoiceItem.add(new InvoiceItem(t[0], q,t[2]));
									if(t[2].equals("L"))
										invoiceItem.add(new InvoiceItem(t[0], q,t[2],t[3]));
								}
								if(type.equals("S")){
									invoiceItem.add(new InvoiceItem(t[0],t[1],t[2],t[3]));
		}
		}
						
		}
					} catch (NumberFormatException e) {
						
						e.printStackTrace();
					}
				}
				}
			
				
		}





		
	
		





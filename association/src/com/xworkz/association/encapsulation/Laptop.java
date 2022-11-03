package com.xworkz.association.encapsulation;

public class Laptop {
	private String name="HP 15 q";
	private String source="USA";
	private double price=160000;
	private boolean nice=true;
	private long ip=2345l;
	String color="black";
	private String brand="hp";
	private String laptopcompany="hp";
	private String ownerNames="Dave packard";
	public long ownersNumbers=3444;
	public int  ram=4;

    
    
     public String getBrand() {
    	 return this.brand;
    	 
     }
     void setBrand(String brand) {
    	 this.brand=brand;
    	 
     }
     public double getprice() {
    	 return this.price;
     }
     void setprice(double price) {
    	 this.price=price;
    	 
     }
    
     public String getsource() {
    	 return this.source;
    	
     }
     void setsource(String source) {
    	 this.source=source;
    	 
     }
     public boolean getnice() {
    	 return this.nice;
    	
     }
     void setnice(boolean nice) {
    	 this.nice=nice;
    	 
     }
     public String getname() {
    	 return this.name;
    	
     }
     void setname(String name) {
    	 this.name=name;
    	 
     }
     public String getcolor() {
    	 return this.color;
    	
     }
     void setcolor(String color) {
    	 this.color=color;
    	 
     }
     public String getlaptopcompany() {
    	 return this.laptopcompany;
    	
     }
     void setlaptopcompany(String laptopcompany) {
    	 this.laptopcompany=laptopcompany;
    	 
     }
     public long getip() {
    	 return this.ip;
    	
     }
     void setip(long ip) {
    	 this.ip=ip;
    	 
     }
     public String getownerNames() {
    	 return this.ownerNames;
    	
     }
     void setownerNames(String ownerNames) {
    	 this.ownerNames=ownerNames;
    	 
     }
     
}

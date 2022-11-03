package com.xworkz.association.encapsulation;

public class Mouse {
	public String name="razerDeathAdder V2";
	private double frequency=2.44;
	private double price=1200;
	private boolean nice=true;
	private String type="razer 4524";
    private String network="wireless";//
    private String color="black";
    private String brand="tip";
    private String company="top";
    private String connentedDevices="1";
   
    private String password="poi8767";//
    public String getnetwork() {
    	 return this.network;
    	 
     }
     void setnetwork(String network) {
    	 this.network=network;
    	 
     }
    
       public String getpassword() {
        	 return this.password;
        	 
         }
         void setpassword(String password) {
        	 this.password=password;
        	 
         }
   
   
   public String gettype() {
     	 return this.type;
     	 
      }
      void settype(String type) {
     	 this.type=type;
     	 
      }
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
  
  
   public boolean getnice() {
  	 return this.nice;
  	
   }
   void setnice(boolean nice) {
  	 this.nice=nice;
  	 
   }
  
   public  String getcolor() {
  	 return this.color;
  	
   }
   void setcolor(String color) {
  	 this.color=color;
  	 
   }
   public double getfrequency() {
  	 return this.frequency;
  	
   }
   void setfrequency(double frequency) {
  	 this.frequency=frequency;
  	 
   }
   public String getcompany() {
  	 return this.company;
  	
   }
   void setPhonecompany(String company) {
  	 this.company=company;
  	 
   }
   public String getconnentedDevices() {
  	 return this.connentedDevices;
  	
   }
   void setownerNames(String connentedDevices) {
  	 this.connentedDevices=connentedDevices;
  	 
   }
	



}

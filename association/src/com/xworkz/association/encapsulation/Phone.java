package com.xworkz.association.encapsulation;

public class Phone {

	private String name="MI";
	private double frequency=2.4;
	private double price=10000;
	private boolean nice=true;
	private String type="Mi 4524";
    private String network="wireless";//
    private String color="black";
    private String brand="kit";
    private String Phonecompany="ncc";
    private String connentedDevices="1";
    private long ownersNumbers=9876;//
    private String password="poi8767";//
    public String getnetwork() {
    	 return this.network;
    	 
     }
     void setnetwork(String network) {
    	 this.network=network;
    	 
     }
     public long getownersNumbers() {
      	 return this.ownersNumbers;
      	 
       }
       void setownersNumbers(long ownersNumbers) {
      	 this.ownersNumbers=ownersNumbers;
      	 
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
   public double getfrequency() {
  	 return this.frequency;
  	
   }
   void setfrequency(double frequency) {
  	 this.frequency=frequency;
  	 
   }
   public String getPhonecompany() {
  	 return this.Phonecompany;
  	
   }
   void setPhonecompany(String Phonecompany) {
  	 this.Phonecompany=Phonecompany;
  	 
   }
   public String getconnentedDevices() {
  	 return this.connentedDevices;
  	
   }
   void setownerNames(String connentedDevices) {
  	 this.connentedDevices=connentedDevices;
  	 
   }
	
}

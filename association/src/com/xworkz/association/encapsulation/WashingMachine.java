package com.xworkz.association.encapsulation;

public class WashingMachine {
	public String name="samsung";
	private double frequency=2.4;
	private double price=10500;
	private boolean nice=true;
	private String type="mo 4524";
    private String color="black";
    private String brand="samsung kit";
    private String washingMachine="nc";
    private String connentedDevices="1";
    private String vottage="45";
   public String orderNumber="9876";
    private String password="poi8767";//
	private String washingMachinecompany;
	
    public String getwashingMachinecompany() {
    	 return this.washingMachinecompany;
    	 
     }
     void setwashingMachinecompany(String washingMachinecompany) {
    	 this.washingMachinecompany=washingMachinecompany;
    	 
     }
    

     public String getvottage() {
      	 return this.vottage;
      	 
       }
       void setvottage(String vottage) {
      	 this.vottage=vottage;
      	 
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
   public String getwashingMachine() {
  	 return this.washingMachine;
  	
   }
   void setPhonecompany(String washingMachine) {
  	 this.washingMachine=washingMachine;
  	 
   }
   public String getconnentedDevices() {
  	 return this.connentedDevices;
  	
   }
   void setownerNames(String connentedDevices) {
  	 this.connentedDevices=connentedDevices;
  	 
   }
 
	


}

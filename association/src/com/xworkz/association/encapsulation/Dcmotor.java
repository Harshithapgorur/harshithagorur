package com.xworkz.association.encapsulation;

public class Dcmotor {
	public String name="DC Drive 2Hp";
	private double Vottage=230;
	private double price=3000;
	private boolean nice=true;
	private String type="Drive 4524";
    private String network="wire";//
    private String color="black";
    private String brand="ke34";
    private String company="Single Phase";
    public long Id=15678765;
   
    private String password="poi8767";//
	private Object vottage;
	
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
   public double getvottage() {
  	 return this.Vottage;
  	
   }
   void setvottage(double Vottage) {
  	 this.vottage=vottage;
  	 
   }
   public String getcompany() {
  	 return this.company;
  	
   }
   void setPhonecompany(String company) {
  	 this.company=company;
  	 
   }
  
	

}

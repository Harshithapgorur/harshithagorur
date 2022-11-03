package com.xworkz.association.encapsulation;

public class Bag {
	private String name="Tinytot";
	private double price=100;
	private boolean nice=true;
	private String type="school bag";
    private String color="black";
    private String brand="Rozen";
    private String bagcompany="boAtNss";
    private long connentedDevices=1;
    private long ownersNumbers=9876;//
    private String password="poi8767";//
    
    public String getbagcompany() {
     	 return this.bagcompany;
     	 
      }
      void setbagcompany(String bagcompany) {
     	 this.bagcompany=bagcompany;
     	 
      }
    
    public long getconnentedDevices() {
      	 return this.connentedDevices;
      	 
       }
       void setconnentedDevices(long connentedDevices) {
      	 this.connentedDevices=connentedDevices;
      	 
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
}

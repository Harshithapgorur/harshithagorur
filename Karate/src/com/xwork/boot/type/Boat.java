package com.xwork.boot.type;


	public class Boat {

		public String name;
		public String color;
		public String companyName;
		public char type;
		public String owner;
		
		
		public Boat() {
			System.out.println("enterd the boat name");
		}
		public Boat(String name)
		{
			this.name=name;
			System.out.println("best gift");
		}
		public Boat(String color,char type)
		{
			this.type=type;
			this.color=color;
			System.out.println("best watch ");
		}
		public Boat(String companyName,char type,String owner )
		{
			this.companyName=companyName;
			this.type=type;
			this.owner=owner;
			System.out.println("gifted ");
			
		}
		public Boat (char type,String companyName) {
			this.companyName=companyName;
			this.type=type;
			
			
		}
		public Boat(String owner,String companyName,char type) {
			this.owner=owner;
			this.companyName=companyName;
			this.type=type;
			
			
		}
		public Boat(String owner,String companyName,char type,String color) {
			this.owner=owner;
			this.companyName=companyName;
			this.type=type;
			this.color=color;
		}
		public Boat(String owner,String companyName,char type,String color,String name) {
			this.owner=owner;
			this.companyName=companyName;
			this.type=type;
			this.color=color;
			this.name=name;
		}
		public Boat(String owner,char type,String companyName,String color,String name) {
			this.owner=owner;
			this.companyName=companyName;
			this.type=type;
			this.color=color;
			this.name=name;
		
		}
	}
	



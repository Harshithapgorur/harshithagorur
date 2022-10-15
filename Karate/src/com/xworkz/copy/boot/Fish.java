package com.xworkz.copy.boot;

public class Fish {

		public String name;
		public String type;
		public double price;
		public float weight;
		public double length;
		
		
		public Fish() {
			System.out.println("entered fish name");
			
		
		}
		public Fish(String name) {
			this.name=name;
			System.out.println("================");
			
		}
		public Fish(String name,double price) {
			this.name=name;
			this.price=price;
			
		}
		public Fish(String name,double price,double length) {
			this.name=name;
			this.price=price;
			this.length=length;
		}
	public Fish(float weight,double price,double length) {
		this.weight=weight;
		this.price=price;
		this.length=length;
	}

	public Fish(String type,float weight) {
	this.type=type;
	this.weight=weight;


	}
	public Fish(double length,double price) {
		this.length=length;
		this.price=price;
		
	}

	public Fish(double length,float weight) {
		this.length=length;
		this.weight=weight;
	}

	public Fish(String type,float weight,double length) {
		this.type=type;
		this.weight=weight;
			this.length=length;
	}

	}



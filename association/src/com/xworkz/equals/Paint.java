package com.xworkz.equals;

public class Paint {

	private String name;
	private String company;
	private String color;
	private String brand;
	private String type;
	private String mfg;
	private String exDate;
	private double price;
	private String quantity;
	private boolean quality;

	public Paint() {

		System.out.println("running default const ");

	}

	public Paint(String name, String company, String color, String brand, String type, String mfg, String exDate,
			double price, String quantity, boolean quality) {
		super();
		this.name = name;
		this.company = company;
		this.color = color;
		this.brand = brand;
		this.type = type;
		this.mfg = mfg;
		this.exDate = exDate;
		this.price = price;
		this.quantity = quantity;
		this.quality = quality;
	}

	@Override
	public String toString() {
		return "Paint [name=" + name + ", company=" + company + ", color=" + color + ", brand=" + brand + ", type="
				+ type + ", mfg=" + mfg + ", exDate=" + exDate + ", price=" + price + ", quantity=" + quantity
				+ ", quality=" + quality + "]";
	}

	@Override
	public boolean equals(Object other) {
		System.out.println("running equals method in paint");
		if (other instanceof Paint) {
			System.out.println("other in paint, can check the properties");
			Paint casted = (Paint) other;
			if (this.brand.equals(casted.brand)) {
				System.out.println("Barand is same");
				return true;
			}
		} else {
			System.out.println("other is not paint");
		}
		return false;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMfg() {
		return mfg;
	}

	public void setMfg(String mfg) {
		this.mfg = mfg;
	}

	public String getExDate() {
		return exDate;
	}

	public void setExDate(String exDate) {
		this.exDate = exDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public boolean getQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;

	}

}

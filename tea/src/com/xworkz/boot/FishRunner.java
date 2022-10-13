package com.xworkz.boot;

import java.io.File;

public class FishRunner {

	public static void main(String[] args) {
		import com.xworkz.boot.Fish;
		import com.xworkz.boot.Fis;
		public class FishRunner {

			public static void main(String[] args) {
				
				Fish water = new Fish("Happy",670);
				System.out.println(water);
				System.out.println(water.name);
				System.out.println(water.price);
				
				File water1 = new Fish(245.7,"Yellow Fin Tuna");
				System.out.println(water1.weight);
				System.out.println(water1.type);
				
				Fish water2 = new Fish(25,"TUNA");
				System.out.println(water2.length);
				System.out.println(water2.name);
				
				Fish water3 = new Fish("Yellow Fin Tuna",245.7,6700);
				System.out.println(water3.type);
				System.out.println(water3.weight);
				System.out.println(water3.price);
				
				Fish water4 = new Fish(6000,"Albacore",540.7);
				System.out.println(water4.price);
				System.out.println(water4.type);
				System.out.println(water4.weight);
				
				Fish water5 = new Fish(50,6500,"Albacore");
				System.out.println(water5.length);
				System.out.println(water5.price);
				System.out.println(water5.name);
				
				Fish water6 = new Fish(574.6,5000,"Black Fin Tuna",74);
				System.out.println(water6.weight);
				System.out.println(water6.price);
				System.out.println(water6.length);
				System.out.println(water6.type);
				
				
				Fish water7 = new Fish(45,"Albacore",8000,890);
				System.out.println(water7.length);
				System.out.println(water7.type);
				System.out.println(water7.price);
				System.out.println(water7.weight);
			}

		}
	}

}

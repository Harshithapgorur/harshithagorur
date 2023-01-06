package pattren;

public class C1 {
 int x=40;
}

 class C2 extends C1{
	int x=50;
	
}
 class object1{
	 public static void main(String[] args) {
	 C1 c1=new C1();
	 System.out.println(c1.x);
	 C2 c2=new C2();
	 System.out.println(c2.x);
	 C1 c3=new C2();
	 System.out.println(c3.x);
	 
	 
 }
 }
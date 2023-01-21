package pattren;

public class Polymar {
	int b=10;
	 void parent() {
		 System.out.println("calling the parent() inthe subclasses");
		
	}

	 public class Child extends Polymar{
		 int a=20;
		 void child() {
			 System.out.println("calling the child() in the childclasses");
		 
}
public class Runne{
	public void main(String[] args) {
		Child gun =new Child();
		System.out.println("the values of a:"+a);
		System.out.println("the values of b:"+b);
		
	}
}
}
}
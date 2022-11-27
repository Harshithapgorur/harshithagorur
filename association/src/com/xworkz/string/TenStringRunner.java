package com.xworkz.string;

public class TenStringRunner {
	public static void main(String[] args) {
	
	String tripleriding ="Triple Riding is a Kannada movie released on"
			+ "  25 Nov, 2022 The movie is directed by Mahesh Gowda and featured Aditi Prabhudeva, "
			+ "Rachana Inder, Sadhu Kokila and Rangayana Raghu as lead characters";
	//spilt all by space
	String[] splitted=tripleriding.split(" ");
	
		for (int i=0; i < splitted.length; i++)
	    {
	      System.out.println(splitted[i]);
	    }
		System.out.println("--------------------------------");
		
		//logic to find no of 'R' in above sentence
				char ch = 'R';
		        int frequency = 0;

		        for(int i = 0; i < tripleriding.length(); i++) {
		            if(ch == tripleriding.charAt(i)) {
		                ++frequency;
		            }
		        }

		        System.out.println("Frequency of " + ch + " = " + frequency);
		        System.out.println("------------------------");
		        
		        // Find all digits in above string 
		        int count=0;
			    for(int i=0;i<tripleriding.length();i++)
			    {
			      if(Character.isDigit(tripleriding.charAt(i)))
			      count++;
			    
			    }
			    System.out.println("the number of digits in the given string is:" + count);
			    System.out.println("--------------------------------------");
			    
		        //Split by , 
		        String[] splitByComma=tripleriding.split(",");
				
				for (int i=0; i < splitByComma.length; i++)
			    {
			      System.out.println(splitByComma[i]);
			    }
				System.out.println("--------------------------");
				
				//Convert above string to char []
				char[] tripleRideString = tripleriding.toCharArray();
				
				System.out.println("char array elements:");
				for(int i=0;i<tripleRideString.length;i++) {
					
					System.out.println(tripleRideString[i]);
				}
				System.out.println("--------------------------------");
				
				//Reverse above string 
				System.out.println("Reversed string is");
				for(int i=tripleRideString.length-1;i>=0;i--)
				{
		   			System.out.print(tripleRideString[i]);
				}
				
				System.out.println("--------------------------------");
				
				//Convert to upper case 
				String upper_str = tripleriding.toUpperCase();
				System.out.println(upper_str);
				
				System.out.println("---------------------------------------------");
				
				//convert to lower case
				String lower_str=tripleriding.toLowerCase();
				System.out.println(lower_str);
				
				//Print all duplicate Characters
				int cnt=0;
				System.out.println("Duplicate Characters are:");
				  for (int i = 0; i < tripleriding.length(); i++) {
				   for (int j = i + 1; j < tripleriding.length(); j++) {
				    if (tripleRideString[i] == tripleRideString[j]) {
				     System.out.println(tripleRideString[j]+" ");
				     cnt++;
				     break;
				    }
				   }
				  }
				  
				  //find palindrome word in above string 
				  System.out.println("----------------------------");
				  String rev="";
				  for ( int i = tripleriding.length() - 1; i >= 0; i-- )
				         rev = rev + tripleriding.charAt(i);
				  
				  if (tripleriding.equals(rev))
				         System.out.println("String:"+tripleriding+" is a palindrome");
				      else
				         System.out.println("String:"+tripleriding+"  not a palindrome");
				
		
		
	
	

}
}

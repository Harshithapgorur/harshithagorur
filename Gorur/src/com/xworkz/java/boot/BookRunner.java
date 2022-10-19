package com.xworkz.java.boot;

import com.xworkz.java.gorur.Book;

public class BookRunner {

	public static void main(String[] args) {
		
			String[] colors= {"gray", "blue","pink"};
			String [] brands= {"Roll", "ruoapublication"};
			String[] company= {"rupabook","moon"};
			long[] rollNumbers= {7, 7l};
			String[] subjectbook= {"maths","cs"};
			String[] ownername= {"happy","fine"};
			 Book book= new Book("sony",56, 200, true, colors, brands, company, rollNumbers,subjectbook,ownername);
			
			
			book.display();
			 
	}

}

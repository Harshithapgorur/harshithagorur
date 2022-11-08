package com.xworkz.inheritance.subclass;

import com.xworkz.inheritance.Invitation;

public class InvitationChlid extends Invitation {

	public InvitationChlid(String shape, double price, String color) {
		super(shape, price, color);

		InvitationChlid subchlid =new InvitationChlid("box",24,"blue") ;
		
	}

	

}

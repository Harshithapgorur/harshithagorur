package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.Invitation;

public class InvitationRunner {

	public static void main(String[] args) {
		Object object=new Invitation("box", 45, "jp");
if(object instanceof Invitation) {
	Invitation invitation=(Invitation) object;
	System.out.println(invitation.color);
	System.out.println(invitation.price);
	System.out.println(invitation.shape);
	
}
	}

}

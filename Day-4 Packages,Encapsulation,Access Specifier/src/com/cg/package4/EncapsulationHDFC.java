package com.cg.package4;

import com.cg.package3.HDFC;
//Program on Encapsulation
public class EncapsulationHDFC {

	public static void main(String[] args) {
		HDFC h=new HDFC();
		//h.amount=67;
		
		h.setAmount(56000);//calling setters
		System.out.println("The amount in my bank is: "+h.getAmount());//calling getters
		

	}

}

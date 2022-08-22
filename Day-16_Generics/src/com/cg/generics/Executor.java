package com.cg.generics;

public class Executor {

	public static void main(String[] args) {
		//create a sender to send a string message
		Sender<String>obj=new Sender<>();
		obj.setMessage("Generic Class Demo");
		obj.sendMessage();
		
		System.out.println();
		
		//create an email object to be send using sender
		Email em=new Email();
		em.setFrom("skumbhalkar@tnsif.org");
		em.setTo("shraddhakharnare@gmail.com");
		em.setSubject("Java Full Stack");
		em.setBody("About Training and placement");
		System.out.println(em.getBody());
		//create a sender to send this email
		Sender<Email>obj1=new Sender<Email>();
		obj1.setMessage(em);
		
		obj1.sendMessage();
		

	}

}

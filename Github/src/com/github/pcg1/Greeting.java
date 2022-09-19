package com.github.pcg1;

public class Greeting {

	private String username;
	private String msg = "Hello ";
	
	public void display() {
		System.out.println(msg  + this.username);
	}
	
	public static void main(String[] args) {
		
		Greeting greet = new Greeting();
		greet.username = "Ganesh";
		greet.display();
		
	}

}

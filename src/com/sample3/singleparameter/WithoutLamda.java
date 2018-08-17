package com.sample3.singleparameter;

public class WithoutLamda {
	public static void main(String[] args) {
		Sayable s1 = new Sayable() {		
			@Override
			public void say(String message) {
				System.out.println("Hi "+message);
			}
		};
		s1.say("Sita");
	}

}

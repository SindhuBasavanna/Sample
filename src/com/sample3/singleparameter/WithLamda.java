package com.sample3.singleparameter;

public class WithLamda {
public static void main(String[] args) {
	Sayable s1 = (message)->{
		System.out.println("Hi "+message);
	};
	s1.say("Sita");
}
}

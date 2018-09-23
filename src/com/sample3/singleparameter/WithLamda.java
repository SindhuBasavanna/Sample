package com.sample3.singleparameter;

public class WithLamda {
public static void main(String[] args) {
	Sayable s1 = (m)->{
		System.out.println("Hi "+m);
	};
	s1.say("Sita");
}
}

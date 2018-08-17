package com.sample2.noparameter;

public class WithLamda {
	public static void main(String[] args) {
		String name = "Java";
		Sayable s1 = ()->{
			System.out.println("Programming languague "+name);
		};
		s1.say();
	}

}

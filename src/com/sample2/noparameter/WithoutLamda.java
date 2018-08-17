package com.sample2.noparameter;

public class WithoutLamda {
	public static void main(String[] args) {
		String name = "Java";
		Sayable s1= new Sayable() {
			@Override
			public void say() {
				System.out.println("Programming languague "+name);
			}
		};
		s1.say();
	}
}

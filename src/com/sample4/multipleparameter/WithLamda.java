package com.sample4.multipleparameter;

public class WithLamda {
	public static void main(String[] args) {
		Addable addObj = (int add1,int add2)->{
			System.out.println(add1+add2);
		};
		addObj.add(10, 15);
	}
}

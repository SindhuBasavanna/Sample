package com.sample1.noparameter;

public class WithLamda {
	public static void main(String[] args) {
		int width = 0;
		Drawable d1 = ()->{
			System.out.println("Drawing "+width);
		};
		d1.draw();
	}

}

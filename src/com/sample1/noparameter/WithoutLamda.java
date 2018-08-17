package com.sample1.noparameter;

public class WithoutLamda {
public static void main(String[] args) {
	int width=0;
	Drawable d1 = new Drawable(){
		@Override
		public void draw() {
			System.out.println("Drawing "+width);
		}	
	};
	d1.draw();	
}
}

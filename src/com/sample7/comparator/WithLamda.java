package com.sample7.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WithLamda {
	public static void main(String[] args) {
		List<Product> al = new ArrayList<Product>();
		al.add(new Product(1,"HP Laptop",40000));
		al.add(new Product(2,"Dell",50000));
		al.add(new Product(3,"Keyboard",1000));
		
		al.forEach(
				(p)-> System.out.println("Product ID: "+p.id + " Product name: "+p.name+" Product price: "+p.price)				
				);
		
		Collections.sort(al,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		
		al.forEach(
				(p)-> System.out.println("Product ID: "+p.id + " Product name: "+p.name+" Product price: "+p.price)				
				);
	}

}

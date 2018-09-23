package com.sample7.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WithLamda {
	public static void main(String[] args) {
		List<Product> al = new ArrayList<Product>();
		al.add(new Product(1,"AHP Laptop",40000));
		al.add(new Product(2,"Dell",50000));
		al.add(new Product(3,"Keyboard",1000));
		
		al.forEach(
				(p)-> System.out.println("Product ID: "+p.id + " Product name: "+p.name+" Product price: "+p.price)				
				);
		Comparator c= (p1,p2)->{
			Product p3=(Product)p1;
			Product p4 = (Product)p2;
			if(p3.getPrice()==p4.getPrice())  
				return 0;  
				else if(p3.getPrice()<p4.getPrice())  
				return 1;  
				else  
				return -1;  
			//return p3.getName().compareTo(p4.getName());
			//return p3.getPrice() <= (p4.getPrice());

		};
		Collections.sort(al,c);
		/*Collections.sort(al,(p1, p2)->{
			return p1.name.compareTo(p2.name);
		});*/
		
		al.forEach(
				(p)-> System.out.println("Product ID: "+p.id + " Product name: "+p.name+" Product price: "+p.price)				
				);
	}

}

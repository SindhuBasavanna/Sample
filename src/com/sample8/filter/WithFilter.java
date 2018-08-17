package com.sample8.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class WithFilter {
public static void main(String[] args) {
	List<Product> prod = new ArrayList<Product>();
	prod.add(new Product(1, "HP Laptop", 35000));
	prod.add(new Product(2, "Dell Laptop", 25000));
	prod.add(new Product(3, "keyboard", 1000));
	prod.add(new Product(4, "mouse", 300));
	
	Stream<Product> filtered_data = prod.stream().filter(p -> p.price<15000 );

	filtered_data.forEach(
			(n)-> System.out.println("name:"+n.name+" price:"+n.price));
}
}

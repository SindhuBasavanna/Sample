package com.sample5.traverseUsingForEach;

import java.util.ArrayList;
import java.util.List;

public class SampleForEach {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("ABC");
		list.add("XYZ");
		list.add("GHJ");
		//Consumer interface----accept--one argument it can be anything---returns void
		//predicate interface----test---anyargument---it returns boolean
		//bifunction interface---2argument--any argu---returns any return type
		//list.forEach(System.out::println);
				
		list.forEach(
				n->System.out.println(n)
				);
	}

}

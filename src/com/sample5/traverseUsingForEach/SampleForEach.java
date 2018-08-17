package com.sample5.traverseUsingForEach;

import java.util.ArrayList;
import java.util.List;

public class SampleForEach {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("ABC");
		list.add("XYZ");
		list.add("GHJ");
		
		list.forEach(
				(n)->System.out.println(n)
				);
	}

}

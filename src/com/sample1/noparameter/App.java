package com.sample1.noparameter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
	public static void main(String[] args) throws IOException {
		//Stream<String> lines = Files.lines(Paths.get("C://sindhu//coding//cognizantAssignmentreference//records.csv"));
		//System.out.println(lines);
		App app = new App();
		app.convertCSVRecordToList();
	}
	
	


public List<HashMap<String, Object>> convertCSVRecordToList() {

    String csvFile = "C://sindhu//coding//cognizantAssignmentreference//records.csv";
    BufferedReader br = null;
    String line = "";
    String cvsSplitBy = ",";
    HashMap<String, Object> Map = new HashMap<String, Object>();

    List<HashMap<String, Object>> MapList = new ArrayList<HashMap<String, Object>>();

    try {

        br = new BufferedReader(new FileReader(csvFile));

        while ((line = br.readLine()) != null) {

            System.out.println(line);

            String[] data = line.split(cvsSplitBy);   
            Map.put("filed_name", data[3]);
            Map.put("field_name", data[0]);
            Map.put("field_name", data[2]);
            Map.put("fiels_name", data[1]);
            MapList.add(Map);
            Map = new HashMap<String, Object>();                
        }

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
     catch (IOException e) {
        e.printStackTrace();
    }

    return MapList;
}

}

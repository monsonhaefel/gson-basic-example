package example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;

public class GsonBasicTutorial {
	
	public static void main(String [] args) throws IOException {
		
		// Read the JSON file into a java.lang.String
		String data = new String(Files.readAllBytes(Paths.get("MOCK_DATA.json"))); 
	   
	    // You need a instance of the Gson class to marshal JSON to pojos.
		Gson gson = new Gson();
		
		// Convert a java.lang.String of JSON data into an array of pojos
		Person [] persons = gson.fromJson(data, Person[].class);
		
		// Loops through the pojos and prints out each element in a new line
		for(Person person : persons) {
			System.out.println(person);
		}
		
	}

}

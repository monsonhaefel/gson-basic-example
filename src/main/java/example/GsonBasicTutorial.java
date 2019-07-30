package example;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;

public class GsonBasicTutorial {

	public static void main(String [] args) throws IOException {

		PrintWriter writer = null;

		try{
			// Read the JSON file into a java.lang.String
			String data = new String(Files.readAllBytes(Paths.get("MOCK_DATA.json"))); 

			// You need a instance of the Gson class to marshal JSON to pojos.
			Gson gson = new Gson();

			// Convert a java.lang.String of JSON data into an array of pojos
			Person [] persons = gson.fromJson(data, Person[].class);

			// Marshal the pojos back into JSON
			String myData = gson.toJson(persons);

			// Create a print writer for the file MY_DATA.json
			writer = new PrintWriter("MY_DATA.json", "UTF-8");

			// write JSON data to MY_DATA.json
			writer.print(myData);

		}finally{
			if(writer != null) {
				writer.close();
			}
		}
	}
}
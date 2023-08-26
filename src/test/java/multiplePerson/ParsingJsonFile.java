package multiplePerson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import multiplePerson.Person;

public class ParsingJsonFile {

	public static void main(String[] args) {

		byte[] jsonData = null;
		try {
			jsonData = Files.readAllBytes(Paths.get("C:\\Users\\Piyush1993\\Desktop\\Piyush_docs\\Workspace\\JsonParsing\\MultiplePerson.json"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Person[] person = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			 person = mapper.readValue(jsonData, Person[].class);
			 System.out.println("Zone Area: " + person[1].getAddress().getZone().getArea());
			 System.out.println("Mobile No.: " + person[0].getMobile());
			 List<Integer> mob = person[0].getMobile();
			 
			 for(int m : mob)
			 {
				 System.out.println("Mob no: " + m);
			 }
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

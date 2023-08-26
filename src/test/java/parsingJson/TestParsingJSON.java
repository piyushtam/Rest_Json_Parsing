package parsingJson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TestParsingJSON {

	public static void main(String[] args) throws IOException {
		
		byte[] jsonData = Files.readAllBytes(Paths.get("C:\\Users\\Piyush1993\\Desktop\\Piyush_docs\\Workspace\\JsonParsing\\parsing.json"));
		ObjectMapper mapper = new ObjectMapper();
		Person person = mapper.readValue(jsonData, Person.class);
		System.out.println(person.getEmail());
		System.out.println(person.getAge());
		System.out.println(person.getLastName());
		System.out.println(person.getFirstName());
		System.out.println(person.getAddress().getCity());
		System.out.println(person.getAddress().getCountry());
		System.out.println(person.getAddress().getState());
		System.out.println(person.getAddress().getZone().getArea());
		System.out.println(person.getAddress().getZone().getPin());
	}

}

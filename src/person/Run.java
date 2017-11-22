package person;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Run {

	
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("Teacher Names"));
		
		 ArrayList<Person> persons = new ArrayList<Person>();

		while(scan.hasNextLine()){
			persons.add(new Person(scan.nextLine()));
		}
		

		Collections.sort(persons);
		for(Person p : persons){
			System.out.println(p.getFirstname());
		}
		
	}

}

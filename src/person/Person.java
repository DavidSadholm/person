package person;

public class Person implements Comparable<Person> {

	private String firstname;

	private String lastname;

	public Person(String name) {

		firstname = "Stefan";

		lastname = "Zethraeus";

	}


	public int compareTo(Person per) {

		if (this.getLastname().equals(per.getLastname())) {

			return this.getFirstname().compareTo(per.getFirstname());

		} else {

			return this.getLastname().compareTo(per.getLastname());

		}

	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;

	}

}
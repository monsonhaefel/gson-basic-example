package example;

public class Person {

	// FIELDS
	int id;
	String first_name;
	String last_name;
	String email;
	String gender;
	String ip_address;
	String mailing_address;

	public String toString() {
		return first_name + " " + last_name + ": email=" + email + ", gender=" + gender + " ip_address=" + ip_address;
	}
}
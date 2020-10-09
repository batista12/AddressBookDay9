package Address;

import java.util.*;
public class AddressBook {
	private String firstName;
	private String lastName;
	private String address;
	private String state;
	private int zip;
	private long phoneNo;
	private String emailId;
	/**
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param state
	 * @param zip
	 * @param phoneNo
	 * @param emailId
	 */
	public AddressBook(String firstName, String lastName, String address, String state, int	zip, long phoneNo, String emailId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.state = state;
		this.zip = zip;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
	}
	/**
	 *
	 */
	@Override
	public String toString() {
		return "Name: " + firstName + " " + lastName + " Address: " + address +" "+ " zip: " + zip + "PhnNo: "+ " " +phoneNo+ " " + "Email: "+ emailId;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("First Name: ");
		String firstName = sc.nextLine();
		System.out.println("Last Name: ");
		String lastName = sc.nextLine();
		System.out.println("Address: ");
		String address = sc.nextLine();
		System.out.println("State: ");
		String state = sc.nextLine();
		System.out.println("ZIP: " );
		int zip = sc.nextInt();
		System.out.println("Phone No: ");
		long phoneNo = sc.nextLong();
		sc.nextLine();
		System.out.println("Email ID: ");
		String emailId = sc.nextLine();
		AddressBook contact = new AddressBook(firstName, lastName, address,state, zip, phoneNo, emailId);
		System.out.println(contact);
	}
}

package com.capgemini.addressbook;
import java.util.*;
public class AddressBook {
	private ArrayList<ContactDetails> arrayList;
	private Map<String, ContactDetails> detailsMap;
	private AddressBook() {
		arrayList = new ArrayList<>();
		detailsMap = new HashMap<>();
	}
	/**
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param state
	 * @param zip
	 * @param phoneNo
	 * @param emailId
	 */
	private void addContactDetails(String firstName, String lastName, String address, String
			state, int zip, long phoneNo, String emailId) {
		ContactDetails contactDetail = new ContactDetails();
		contactDetail.setContactDetails(firstName, lastName, address, state, zip, phoneNo,emailId);
		arrayList.add(contactDetail);
		detailsMap.put(state, contactDetail);
		detailsMap.put(address, contactDetail);
	}
	/**
	 * @param name
	 */
	private void searchbyCity(String address) {
		ContactDetails contactObj = detailsMap.get(address);
		System.out.println(contactObj);
	}

	/**
	 * @param state
	 */
	private void searchbyState(String state) {
		ContactDetails contactObj = detailsMap.get(state);
		System.out.println(contactObj);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AddressBook addressBook = new AddressBook();
		System.out.println("No. of contact details to enter: ");
		int numOfCon = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < numOfCon; i++) {
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
			addressBook.addContactDetails(firstName, lastName, address, state, zip,phoneNo, emailId);
		}
		System.out.println("Enter name of city you want to persons of: ");
		String city = sc.nextLine();
		addressBook.searchbyCity(city);
		System.out.println("Enter name of state you want to persons of: ");
		String state= sc.nextLine();
		addressBook.searchbyState(state);
	}
}

public class ContactDetails {
	public String firstName;
	public String lastName;
	private String address; 
	private String state;
	private int zip;
	private long phoneNo;
	private String emailId;
	public void setContactDetails(String firstName, String lastName, String address, String state,
			int zip, long phoneNo, String emailId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.state = state;
		this.zip = zip;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "Name: " + firstName + " " + lastName + " Address: " + address + " State: " + state + " Zip: " +
				zip + " Phone No: " + phoneNo + " Email: " + emailId;
	}
}

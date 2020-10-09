import java.util.*;
public class AddressBook {
private int numOfCon = 0;
private ContactDetails[] Array;
private AddressBook() {
Array = new ContactDetails[5];
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
Array[numOfCon] = new ContactDetails();
Array[numOfCon].setContactDetails(firstName, lastName, address, state,
zip, phoneNo, emailId);
numOfCon++;
}
/**
 * @param firstName
 * @param lastName
 */
private void deleteContactDetails(String firstName, String lastName) {
for(int i = 0; i < numOfCon; i++) {
if(Array[i].firstName.equals(firstName) &&
Array[i].lastName.equals(lastName)) {
Array[i] = null;
System.out.println("Contact deleted");
break;
}
}
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
AddressBook addressBook = new AddressBook();
System.out.println("No. of contact details to enter (upto 5): ");
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
addressBook.addContactDetails(firstName, lastName, address, state, zip,
phoneNo, emailId);
}
System.out.println("Enter first name of contact to be deleted: ");
String firstName = sc.nextLine();
System.out.println("Enter last name of contact to be deleted: ");
String lastName = sc.nextLine();
addressBook.deleteContactDetails(firstName, lastName);
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
/**
 * @param firstName
 * @param lastName
 * @param address
 * @param state
 * @param zip
 * @param phoneNo
 * @param emailId
 */
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

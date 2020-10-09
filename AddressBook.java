  public class AddressBookMain {
	private String firstName;
	private String lastName;
	private String address;
	private String state;
	private String zip;
	private String phoneNo;
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
	public AddressBookMain (String firstName, String lastName, String address, String state, String zip,
			String phoneNo, String emailId)
	{
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
	public void displayInfo(){
		System.out.println("firstName: " + firstName);
		System.out.println("lastName: " + lastName);
		System.out.println("city: " + address);
		System.out.println("state: " + state);
		System.out.println("zip: " + zip);
		System.out.println("phoneNumber: " + phoneNo);
		System.out.println("email: " + emailId);
	}
	public static void main(String[] args) {
		AddressBookMain contact = new AddressBookMain( "Manasi", "Singh", "svghdfgh",
				"hjshghja","674384", "92324448391", "manasisingh2602@gmail.com");
		contact.displayInfo();
		System.out.println(contact);
	}
}

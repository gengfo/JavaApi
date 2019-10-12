package model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {

	private long id;
	private String name;
	private Address address;
	private List<PhoneNumber> phoneNumbers;

	public Customer() {
		phoneNumbers = new ArrayList<PhoneNumber>();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

}

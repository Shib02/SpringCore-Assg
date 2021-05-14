package com.java.org;

public class Customer {

	
	private int custID;
	private String custName;
	private String custContact;
	private Addresses custAddresses;
	
	public Customer(int custID, String custName, String custContact, Addresses custAddresses) {
		super();
		this.custID = custID;
		this.custName = custName;
		this.custContact = custContact;
		this.custAddresses = custAddresses;
	}
	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustContact() {
		return custContact;
	}
	public void setCustContact(String custContact) {
		this.custContact = custContact;
	}
	public Addresses getCustAddresses() {
		return custAddresses;
	}
	public void setCustAddresses(Addresses custAddresses) {
		this.custAddresses = custAddresses;
	}
	@Override
	public String toString() {
		return "Customer [custID=" + custID + ", custName=" + custName + ", custContact=" + custContact
				+ ", custAddresses=" + custAddresses + "]";
	}
	
}

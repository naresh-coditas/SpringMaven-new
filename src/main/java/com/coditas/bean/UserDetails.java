package com.coditas.bean;

public class UserDetails {

	private String userName;
	private String firstName;
	private String lastName;

	private UserAddress localAddress;
	private UserAddress permanantAddress;

	private ElectronicAddress electronicAddress;

	private String password;


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public UserAddress getLocalAddress() {
		return localAddress;
	}

	public void setLocalAddress(UserAddress localAddress) {
		this.localAddress = localAddress;
	}

	public UserAddress getPermanantAddress() {
		return permanantAddress;
	}

	public void setPermanantAddress(UserAddress permanantAddress) {
		this.permanantAddress = permanantAddress;
	}

	public ElectronicAddress getElectronicAddress() {
		return electronicAddress;
	}

	public void setElectronicAddress(ElectronicAddress electronicAddress) {
		this.electronicAddress = electronicAddress;
	}

}

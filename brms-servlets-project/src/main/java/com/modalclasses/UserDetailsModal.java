package com.modalclasses;

public class UserDetailsModal {
	
	private String userId;
	private String username;
	private String email;
	private String mblNo;
	private String address;
	private String dateOfBirth;
	private String physicalStatus;
	private String idProof;
	private String loginid;
	private String password;
	private int age;
	
	public UserDetailsModal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDetailsModal(String userId, String username, String email, String mblNo, String address,
			String dateOfBirth, String physicalStatus, String idProof, String loginid, String password, int age) {
		super();
		this.userId = userId;
		this.username = username;
		this.email = email;
		this.mblNo = mblNo;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.physicalStatus = physicalStatus;
		this.idProof = idProof;
		this.loginid = loginid;
		this.password = password;
		this.age = age;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMblNo() {
		return mblNo;
	}

	public void setMblNo(String mblNo) {
		this.mblNo = mblNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPhysicalStatus() {
		return physicalStatus;
	}

	public void setPhysicalStatus(String physicalStatus) {
		this.physicalStatus = physicalStatus;
	}

	public String getIdProof() {
		return idProof;
	}

	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}

	public String getLoginid() {
		return loginid;
	}

	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserDetailsModal [userId=" + userId + ", username=" + username + ", email=" + email + ", mblNo=" + mblNo
				+ ", address=" + address + ", dateOfBirth=" + dateOfBirth + ", physicalStatus=" + physicalStatus
				+ ", idProof=" + idProof + ", loginid=" + loginid + ", password=" + password + ", age=" + age + "]";
	}
	
	


	
}

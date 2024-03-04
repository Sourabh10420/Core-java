package in.co.rays.StudentDetails;

import java.util.Date;

public class StudentDetailsBean {

	private int id;
	private String name;
	private String sureName;
	private Date dob;
	private String mobileNo;
	private String enrollmentNo;
	
	public String getEnrollmentNo() {
		return enrollmentNo;
	}
	public void setEnrollmentNo(String enrollmentNo) {
		this.enrollmentNo = enrollmentNo;
	}
	private  Date admistionDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSureName() {
		return sureName;
	}
	public void setSureName(String sureName) {
		this.sureName = sureName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Date getAdmistionDate() {
		return admistionDate;
	}
	public void setAdmistionDate(Date admistionDate) {
		this.admistionDate = admistionDate;
	}
	
	
}



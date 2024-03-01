package in.co.rays.ExamForm;

public class ExamFormBean {
	
	private int id;
	private String  firstname;
	private String lastname;
	private String emailid;
	private String mobileno;
	private String subject;
	private int subjectid;
	
	
	int getId() {
		return id;
	}
	public void setId(int Id) {
		this.id = Id;
	}
	public String getFirstName() {
		return firstname;
	}
	public void setFirstName(String FirstName) {
		this.firstname = FirstName;
	}
	public String getLastName() {
		return lastname;
	}
	public void setLastName(String LastName) {
		this.lastname = LastName;
	}
	public String getEmailId() {
		return emailid;
	}
	public void setEmailId(String EmailId) {
		this.emailid = EmailId;
	}
	public String getMobileNo() {
		return mobileno;
	}
	public void setMobileNo(String MobileNo) {
		this.mobileno = MobileNo;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String Subject) {
		this.subject = Subject;
	}
	public 	int getSubjectId() {
		return subjectid;
	}
	public void setSubjectId(int SubjectId) {
		this.subjectid = SubjectId;
	}
	
}
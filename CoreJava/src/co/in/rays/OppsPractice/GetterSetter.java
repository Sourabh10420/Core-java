package co.in.rays.OppsPractice;

public class GetterSetter {
	
		private int id;
		private String firstName;
		private String lastname;

	public void setid(int id) {
		this.id= id;
	}
	public int getId() {
		return id;
	}
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	public String getFirstName() {
		return firstName;
		
	}
	public void setLastName(String lastname) {
		this.lastname=lastname;
	}
	public String getLastName() {
		return "lastname";
		
	}
}


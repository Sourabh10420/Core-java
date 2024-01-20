package co.in.rays.OppsPractice;

public class TestGetterSetterPerson {
	public static void main(String[] args) {
		GetterSetterPerson GP = new GetterSetterPerson();
		
			GP.setName("Sourabh");
			GP.setAddress("indore");
			GP.setAvg_Age(27);
			
			System.out.println(GP.getName()+"\n"+GP.Address+"\n"+GP.getDob()+"\n"+GP.getAvg_Age());
	}	
	
}

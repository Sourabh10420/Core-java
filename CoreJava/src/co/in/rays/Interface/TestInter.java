package co.in.rays.Interface;

public  class TestInter {
	
	public static void main(String[] args) {
		
		BuisnessMan bm= new BuisnessMan();
		
		bm.earn();
		
		bm.party();
		
		bm.donation();
		
		bm.helpToOther();
		
		SocialWorker sw= new BuisnessMan();
		
		
		sw.helpToOther();
		
		
		RichMan rm= new BuisnessMan();
		
		
		
		rm.earn();
		rm.party();
		rm.donation();
		
		
		System.out.println(RichMan.Money);
	}
	
	

}

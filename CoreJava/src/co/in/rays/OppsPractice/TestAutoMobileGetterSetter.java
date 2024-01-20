package co.in.rays.OppsPractice;

public class TestAutoMobileGetterSetter {
	public static void main(String[] args) {
		
		AutoMobileGetterSetter am = new AutoMobileGetterSetter();
			
			am.setcolor("purple");
			am.setSpeedofBike(180);
			am.setHeadLights(4);
			am.setmake("2023");
			am.setQuantityOfSilencer(3);
			am.setNoOfGear(6);
			
			System.out.println("My bike Details");
			System.out.println("Bike Details:-"+"\n"+"color"+"="+am.getColor()+"\n"+"Year"+"="+am.getMake()+"\n"+"Speed of bike"+"="+am.getSpeedOfBike()+"\n"+"No of Gear"+"="+am.getNoOFGear()+"\n"+"No of HeadLight"+"="+am.getHeadLights()+"\n"+"No of Silencer"+"="+am.getQuantityOfSilencer());
			
	}
}

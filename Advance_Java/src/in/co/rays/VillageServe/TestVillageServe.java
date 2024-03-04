package in.co.rays.VillageServe;

public class TestVillageServe {

	public static void main(String[] args) throws Exception {
		
		//testNextPk();
		testAdd();
	}
	
	public static void testNextPk() throws Exception{
		
		VillageServeModel model = new VillageServeModel();
		
		VillageServeBean bean = new VillageServeBean();
		
		int pk = model.nextPk();
		
		System.out.println("pk" + pk);
		
	}
	
	public static void testAdd() throws Exception{
		
		VillageServeBean bean = new VillageServeBean();
		
		VillageServeModel model = new VillageServeModel();
		
		
		bean.setVillageName("Likhi");
		bean.setMalePersone(1800);
		bean.setFemalePersone(1656);
		bean.setChild(1298);
		bean.setVillageCode("V1008C");
		
		model.add(bean);
		
		
	}
	
}

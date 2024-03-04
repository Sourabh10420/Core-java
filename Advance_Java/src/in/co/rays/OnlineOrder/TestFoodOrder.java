package in.co.rays.OnlineOrder;

import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

public class TestFoodOrder {
	
	public static void main(String[] args) throws Exception {
		
	//	testNextPk();
    //  testAdd();
	 //testUpdate();
	//	testDelete();
	//testFindByPk();
		// testSearchByNormal();
		testSearch();
	
	}

	public static void testNextPk() throws Exception{
			
			FoodOrderBean bean = new FoodOrderBean();
			
			FoodOrderModel model = new FoodOrderModel();
			
			int pk = model.nextPk();
			
			System.out.println("Pk" + pk);
	}
	
	public static void testAdd() throws Exception{
			
			FoodOrderBean bean = new FoodOrderBean();
			
			FoodOrderModel model = new FoodOrderModel();
			
			Date d = new Date("2024/02/28");
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			
			String str = sdf.format(d);
			
			bean.setName("Mohit");
			bean.setFoodName("GulabJamun");
			bean.setFoodPrice(100);
			bean.setAddress("Musakhedi");
			bean.setOrderMod("Swiggy");
			bean.setOrderDate(new Date(str));
			bean.setEmailId("mohit@gmail.com");
			
			model.add(bean);
	}
	
	public static void testUpdate() throws Exception{
		
		FoodOrderBean bean = new FoodOrderBean();
		
		FoodOrderModel model = new FoodOrderModel();
		
		Date d = new Date("2024/02/28");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
		String str = sdf.format(d);
		
		bean.setSn(6);
		bean.setName("Manan");
		bean.setFoodName("GulabJamun");
		bean.setFoodPrice(100);
		bean.setAddress("Musakhedi");
		bean.setOrderMod("Swiggy");
		bean.setOrderDate(new Date(str));
		bean.setEmailId("manan@gmail.com");
		
		model.update(bean);
		
	}
	
	public static void testDelete() throws Exception{
		
		FoodOrderBean bean = new FoodOrderBean();
		
		FoodOrderModel model = new FoodOrderModel();
		
		model.delete(6);
		
	}
	public static void testFindByPk() throws Exception{
		
		FoodOrderModel model = new FoodOrderModel();
		
		FoodOrderBean bean = model.findByPk(2);
		
		System.out.print("\t"+ bean.getSn());
		System.out.print("\t"+ bean.getName());
		System.out.print("\t"+ bean.getFoodName());
		System.out.print("\t"+ bean.getFoodPrice());
		System.out.print("\t"+ bean.getAddress());
		System.out.print("\t"+ bean.getOrderMod());
		System.out.print("\t"+ bean.getOrderDate());
		System.out.print("\t"+ bean.getEmailId());
		
	}
	
	public static void testSearchByNormal() throws Exception{
		
		FoodOrderModel model = new FoodOrderModel();
		
		FoodOrderBean bean = new FoodOrderBean();
		
		model.searchByNormal(bean);
	}
	
	public static void testSearch() throws Exception{
		
		FoodOrderBean bean = new FoodOrderBean();
		
		FoodOrderModel model = new FoodOrderModel();
		
		bean.setName("s");
		
		List list  = model.search(bean, 1, 5);
		
		Iterator it = list.iterator();
		
		while (it.hasNext()) {
			
			bean = (FoodOrderBean) it.next();
			
			System.out.print("\t"+ bean.getSn());
			System.out.print("\t"+ bean.getName());
			System.out.print("\t"+ bean.getFoodName());
			System.out.print("\t"+ bean.getFoodPrice());
			System.out.print("\t"+ bean.getAddress());
			System.out.print("\t"+ bean.getOrderMod());
			System.out.print("\t"+ bean.getOrderDate());
			System.out.println("\t"+ bean.getEmailId());
			
		}
		

	}
	
}

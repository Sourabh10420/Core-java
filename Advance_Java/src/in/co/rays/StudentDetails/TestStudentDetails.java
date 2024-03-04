package in.co.rays.StudentDetails;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.PrepredStatement.TestDelete;

public class TestStudentDetails {
	
	public static void main(String[] args) throws Exception {
		
		//testNextPk();
		//testAdd();
		// testUpdate();
		 //testDelete();
		 testSearch();
	}
	
	public static void testNextPk() throws Exception{
		
		StudentDetailsBean bean = new StudentDetailsBean();
		
		StudentDetailsModel model = new StudentDetailsModel();
		
		int pk =model.nextPk();
		
		System.out.println("pk" + pk);
	}
	
	public static void testAdd() throws Exception{
		
		StudentDetailsModel model = new StudentDetailsModel();
		
		StudentDetailsBean bean = new StudentDetailsBean();
		
		Date d = new Date("2002/02/18");
		
		Date d1 = new Date("2022/07/14");
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
		
		String str = sdf.format(d);
		
		String str1 = sdf.format(d1);
		
		bean.setName("Manoj");
		bean.setSureName("Gurjar");
		bean.setDob(new Date(str));
		bean.setMobileNo("9926741360");
		bean.setEnrollmentNo("DM156755");
		bean.setAdmistionDate(new Date(str1));
		
		model.add(bean);
	}
	
	public static void testUpdate() throws Exception{
			
			StudentDetailsBean bean = new StudentDetailsBean();
			
			StudentDetailsModel model = new StudentDetailsModel();
			
			Date d = new Date("2001/10/24");
			
			Date d1 = new Date("2021/10/17");
			
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
			
			String str = sdf.format(d);
			
			String str1 = sdf.format(d1);
			bean.setId(5);
			bean.setName("Roshni");
			bean.setSureName("Panwar");
			bean.setDob(new Date(str));
			bean.setMobileNo("8602720187");
			bean.setEnrollmentNo("DM156543");
			bean.setAdmistionDate(new Date(str1));
			
			model.update(bean);
	}
	public static void testDelete() throws Exception{
		
		StudentDetailsBean bean = new StudentDetailsBean();
			StudentDetailsModel model = new StudentDetailsModel();
			
		model.delete(5);
			
	}
	
	public static void testSearch() throws Exception{
		
		StudentDetailsBean bean =  new StudentDetailsBean();
		
	//	bean.setId(1);
		bean.setName("m");
		
		StudentDetailsModel model = new StudentDetailsModel();
		
		List list = model.search(bean, 1, 5);
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			
			bean = (StudentDetailsBean) it.next();
			
			System.out.print("\t"+ bean.getId());
			System.out.print("\t"+ bean.getName());
			System.out.print("\t"+ bean.getSureName());
			System.out.print("\t"+ bean.getDob());
			System.out.print("\t"+ bean.getMobileNo());
			System.out.print("\t"+ bean.getEnrollmentNo());
			System.out.println("\t"+ bean.getAdmistionDate());
		}
		
	}
		
	}


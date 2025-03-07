package in.co.rays.User;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.ExamForm.ExamFormModel;

public class TestUser {
	
	public static void main(String[] args) throws Exception{
		 
			//testAdd();
		//testUpdate();
		//testDelete();
	//	testNextPk();
		//	testSearchByNormal();
			testFIndByPk();
		//testSearch();
	}
	
	private static void testNextPk() throws Exception {
			
			UserModel model = new UserModel();
			
			int pk =model.nextPk();
			
			System.out.println("pk =" + pk);
	}

	public static void testAdd() throws Exception{
    	
    	UserModel model = new UserModel();
    	
    	UserBean bean = new UserBean();
    	
    	Date d = new Date("2008/01/7");
    	
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
    	
    	String str = sdf.format(d);
    	
    
    	bean.setFirstName("Shivam");
    	bean.setLastName("Nigwal");
    	bean.setLoginId("shivam@gmail.com");
    	bean.setPassword("shivam@143");
    	bean.setDob(new Date(str));
    	bean.setAddress("Rajur");
    	
    	model.add(bean);
    }
	
	  public static void testUpdate() throws Exception {
		  
		  UserModel model = new UserModel();
	    	
	    	UserBean bean = new UserBean();
	    	
	    	Date d = new Date("1998/09/10");
	    	
	    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	    	
	    	String str = sdf.format(d);
	    	
	    	bean.setId(3);
	    	bean.setFirstName("Karan");
	    	bean.setLastName("Mandloi");
	    	bean.setLoginId("karan@gmail.com");
	    	bean.setPassword("karan@143");
	    	bean.setDob(new Date(str));
	    	bean.setAddress("Khargone");
	    	
	    	model.update(bean);
	}
	  
	  public static void testDelete() throws Exception{
		  
		   UserModel model = new UserModel();
		 
		model.delete(6);
	  }
	  
	  public static void testSearchByNormal() throws Exception{
		  
		  UserModel model = new UserModel();
		  
		  UserBean bean = new UserBean();
		  
		  model.searchByNormal(bean);
	  }
	  
	  public static void testFIndByPk() throws Exception{
		  
		  UserModel model = new UserModel();
		  
		  UserBean bean = model.findByPk(1);
		  
		  System.out.print("\t"+ bean.getId());
		  System.out.print("\t"+ bean.getFirstName());
		  System.out.print("\t"+ bean.getLastName());
		  System.out.print("\t"+ bean.getLoginId());
		  System.out.print("\t"+ bean.getPassword());
		  System.out.print("\t"+ bean.getDob());
		  System.out.println("\t"+ bean.getAddress());
	  }
	  
	  public static void testSearch() throws Exception{
		  
		  UserModel model = new UserModel();
		  
		  UserBean bean =  new UserBean();
		  
		  bean.setId(1);
		  bean.setFirstName("s");
		  
		  List list = model.search(bean, 1, 5);
		  
		  Iterator it = list.iterator();
		  
		  while(it.hasNext()) {
			  
			  bean = (UserBean) it.next();
			  
			  System.out.print("\t"+ bean.getId());
			  System.out.print("\t"+ bean.getFirstName());
			  System.out.print("\t"+ bean.getLastName());
			  System.out.print("\t"+ bean.getLoginId());
			  System.out.print("\t"+ bean.getPassword());
			  System.out.print("\t"+ bean.getDob());
			  System.out.println("\t"+ bean.getAddress());
		  }
		  
	  }
}

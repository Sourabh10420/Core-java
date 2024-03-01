package in.co.rays.ExamForm;

import java.util.Iterator;
import java.util.List;

public class TestExamForm {

	public static void main(String[] args)  throws Exception{
		
		//testAdd();
		//testUpdate();
		//testDelete();
		//testSearchByNormal();
		testSearchByModrate();
		
	}
	
	public static void testAdd() throws Exception {
		
		ExamFormBean bean = new ExamFormBean();
		
		bean.setId(7);
		bean.setFirstName("Seema");
		bean.setLastName("Gurjar");
		bean.setEmailId("seemagurjar@gmail.com");
		bean.setMobileNo("466756578");
		bean.setSubject("IDBI PO");
		bean.setSubjectId(107);
		
		ExamFormModel model = new ExamFormModel();
		
		model.add(bean);
	}
	public static void testUpdate() throws Exception{
		ExamFormBean bean = new ExamFormBean();
		
		bean.setId(7);
		bean.setFirstName("Roshni");
		bean.setLastName("Gurjar");
		bean.setEmailId("seemagurjar@gmail.com");
		bean.setMobileNo("466756578");
		bean.setSubject("IDBI PO");
		bean.setSubjectId(107);
		
		ExamFormModel model = new ExamFormModel();
		
		model.update(bean);
		
		
	}
		
	public static void testDelete()throws Exception{
		
		ExamFormModel model = new ExamFormModel();
		
		model.delete(7);
	}
	
	public static void testSearchByNormal() throws Exception{
		
		ExamFormBean bean = new ExamFormBean();
		
		ExamFormModel model = new ExamFormModel();
		
		model.searchByNormal(bean);
	}
	
	public static void testSearchByModrate() throws Exception{
		
		ExamFormModel model = new ExamFormModel();
		
		List list = model.searchByModrate();
		
		
		Iterator it  = list.iterator();
		
		while(it.hasNext()) {
			
		ExamFormBean bean  = (ExamFormBean) it.next();
		
		
		System.out.print("\t"+ bean.getId());
			System.out.print("\t"+ bean.getFirstName());
				System.out.print("\t"+ bean.getLastName());
					System.out.print("\t"+ bean.getEmailId());
				System.out.print("\t"+ bean.getMobileNo());
			System.out.print("\t"+ bean.getSubject());
		System.out.println("\t"+ bean.getSubjectId());
		}
		
	}
	
	}


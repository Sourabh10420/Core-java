package in.co.rays.Payment;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;



public class TestPayment {
	
	public static void main(String[] args) throws Exception{
		
		//testNextPk();
		testAdd();
	//	testUpdate();
		//testFindByPk();
		//testSearch(); 
		
		//testDelete();
	}
	public static void testNextPk() throws Exception{
		
		PaymentBean bean = new PaymentBean();
		
		PaymentModel model = new PaymentModel();
		
		int pk = model.nextPk();
		
		System.out.println("pk= "+ pk);
	}
	
	public static void testAdd() throws Exception{
		
		PaymentBean bean = new PaymentBean();
		
		PaymentModel model = new PaymentModel();
		
		Date d = new Date("2023/10/22");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
		String str = sdf.format(d);
		
		
		bean.setPayementDate(new Date(str));
		bean.setDescription("PayemttosendaAshwin");
		bean.setAmmount(10000);
		bean.setPaymentMethod("Paytm");
		bean.setStatus("Payment done");
		bean.setPayer("Ashwin");
		
		model.add(bean);
	}
	public static void testUpdate() throws Exception{
		
		PaymentBean bean = new PaymentBean();
		
		PaymentModel model = new PaymentModel();
		
		Date d = new Date("2023/10/22");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
		String str = sdf.format(d);
		;
		bean.setId(4);
		bean.setPayementDate(new Date(str));
		bean.setDescription("PayemttosendaAshwin");
		bean.setAmmount(10000);
		bean.setPaymentMethod("Paytm");
		bean.setStatus("Payment done");
		bean.setPayer("Shivam");
		
		model.update(bean);
	
}
	public static void testFindByPk() throws Exception{
	
		
		PaymentModel model = new PaymentModel();
		
		
		PaymentBean bean = model.findByPk(2);
		
		
		System.out.print("\t"+ bean.getId());
		System.out.print("\t"+ bean.getPayementDate());
		System.out.print("\t"+ bean.getDescription());
		System.out.print("\t"+ bean.getAmmount());
		System.out.print("\t"+ bean.getPaymentMethod());
		System.out.print("\t"+ bean.getStatus());
		System.out.print("\t"+ bean.getPayer());
		
	}
	
	public static void testSearch() throws Exception{
		
		PaymentModel model = new PaymentModel();
		
		PaymentBean bean = new PaymentBean();
		
		bean.setId(1);
		bean.setPayer("a");
		
		List list = model.search(bean, 1, 5);
		
		Iterator it = list.iterator();
		
		
		while(it.hasNext()) {
			
			bean = (PaymentBean) it.next();
			
			
			System.out.print("\t"+ bean.getId());
			System.out.print("\t"+ bean.getPayementDate());
			System.out.print("\t"+ bean.getDescription());
			System.out.print("\t"+ bean.getAmmount());
			System.out.print("\t"+ bean.getPaymentMethod());
			System.out.print("\t"+ bean.getStatus());
			System.out.print("\t"+ bean.getPayer());
	}
		
}
	public static void testDelete() throws Exception{
		
		PaymentBean bean = new PaymentBean();
		
		PaymentModel model = new PaymentModel();
		
		model.delete(4);
	}
}


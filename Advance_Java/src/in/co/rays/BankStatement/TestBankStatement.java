package in.co.rays.BankStatement;

public class TestBankStatement {
	
	public static void main(String[] args) throws Exception {
		
		//testAdd();
		//testUpdate();
	//	testDelete();
		testSearchBySimple();
	}
	
	



	public static void testAdd() throws Exception{
		
		BankStatementBean bean = new BankStatementBean();
		
		BankStatementModel model = new BankStatementModel();
		
		bean.setId(9);
		bean.setName("Seema");
		bean.setAccountno("86556665");
		bean.setBankname("Yesbank");
		bean.setBalance(8000000);
		bean.setDeposite(676000);
		
		model.add(bean);
		
		
	}
	
	public static void testUpdate() throws Exception{
		
		BankStatementBean bean = new BankStatementBean();
		
		BankStatementModel model = new BankStatementModel();
		
		bean.setId(9);
		bean.setName("Kalu");
		bean.setAccountno("86556665");
		bean.setBankname("Yesbank");
		bean.setBalance(8000000);
		bean.setDeposite(676000);
		
		model.update(bean);
		
	
}
	public static void testDelete() throws Exception{
		
		BankStatementModel model = new BankStatementModel();
		
	model.delete(9);
		
	}
	public static void testSearchBySimple() throws Exception{
		
		BankStatementBean bean = new  BankStatementBean();	
		
		BankStatementModel model = new BankStatementModel();
		
		model.searchBySimple(bean);
		
		
		
	}
}
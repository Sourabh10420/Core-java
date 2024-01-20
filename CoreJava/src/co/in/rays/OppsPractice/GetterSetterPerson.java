package co.in.rays.OppsPractice;

import java.text.SimpleDateFormat;
import java.util.Date;
public class GetterSetterPerson {
		
		String Name = null;
		Date dob = null;
		String Address = null;
		int Avg_Age = 0;
		
			String s  = "25/08/1996";
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String d= sdf.format(s);
			
				public void setName(String Name) {
			this.Name= Name;
			}
				public String getName() {
					return Name;
					}
			public Date getDob() {
					return dob;
			}
				public void setAddress(String Address) {
						this.Address=Address;
				}
					public String getAddress() {
							return Address;
					}
						public void setAvg_Age(int Avg_Age) {
							this.Avg_Age=Avg_Age;
						}
							public int getAvg_Age() {
								return Avg_Age;
							}
								
			
}

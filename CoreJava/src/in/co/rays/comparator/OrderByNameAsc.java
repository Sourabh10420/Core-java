package in.co.rays.comparator;

import java.util.Comparator;

public class OrderByNameAsc implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet m1, Marksheet m2) {
		
		return m1.name.compareTo(m2.name);
	}

}

package in.co.rays.comparator;

import java.util.Comparator;

public class OrderByIdAsc implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet m1, Marksheet m2) {
		
		return m1.id-m2.id;
	}

}

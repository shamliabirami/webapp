package shamli.jerseyproject.Service;

import java.util.ArrayList;
import java.util.List;

import shamli.jerseyproject.model.staff;

public class staffService {
	
	public List<staff> getAllstaff()
	{
		staff s1=new staff(1L,"ramesh","suresh",null);
		staff s2=new staff(1L,"ramesh","narayanan",null);
		List<staff> L=new ArrayList<staff>();
		L.add(s1);
		L.add(s2);
		return L;
	}

}

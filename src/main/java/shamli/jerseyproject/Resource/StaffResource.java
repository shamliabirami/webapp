package shamli.jerseyproject.Resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import shamli.jerseyproject.Service.staffService;
import shamli.jerseyproject.model.staff;
@Path("staff")

public class StaffResource {
	   staffService S=new staffService();
	   @GET
	   @Produces(MediaType.APPLICATION_XML)
	   public List<staff> getStaff(){
		   return S.getAllstaff();
		   
	   }

}

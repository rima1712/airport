package edu.esprit.ressources;


import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import edu.esprit.services.ReservationServiceLocal;



@Path("/reservation")
public class ReservationRessource {
	
	@Inject
	ReservationServiceLocal myejb;
	
	
	@DELETE
	@Path("{IdReservation}")
	@Produces("application/json")
	public void delete( @PathParam("IdReservation")Integer id){
		
		myejb.CancelReservation(id);
	}

}

package edu.esprit.services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.persistance.Reservation;


@Stateless
@LocalBean
public class ReservationService implements ReservationServiceLocal {

	@PersistenceContext
	private EntityManager em;
    public ReservationService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void CancelReservation(Integer id) {
		
		em.remove(em.find(Reservation.class,id));
		
	}

}

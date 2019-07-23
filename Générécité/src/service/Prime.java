package service;

import methode.Manager;
import methode.ServiceRh;

public class Prime {
			
	public int recevoir(ServiceRh< ? extends Manager > rh) {
		return  rh.getEmploye().getSalaire() + rh.getEmploye().getPrime();					
	}
}



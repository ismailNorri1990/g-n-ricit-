package service;

import methode.Manager;
import methode.ServiceRh;

public class Prime {
			
	public int recevoir(ServiceRh< ? extends Manager > serviceRh ,int salaire) {
		return  salaire + 500;					
			}
	}



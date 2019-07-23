package presentation;

import methode.Employe;
import methode.Manager;
import methode.ServiceRh;
import service.Prime;

public class TestApp {

	public static void main(String[] args) {

		ServiceRh<Employe> employe1 = new ServiceRh<Employe>(1, "Norri", "Ismail",1000);

		ServiceRh<Employe> employe2 = new ServiceRh<Employe>(2, "Quinouni", "Issam",1000);

		ServiceRh<Manager> manager1 = new ServiceRh<Manager>(1, "Cadi", "Widad",1000);

		ServiceRh<Manager> manager2 = new ServiceRh<Manager>(2, "Laarichi", "Hamza",1000);
		ServiceRh directeur = new ServiceRh(1, "Zahraoui", "Ayoub",1000);
		
		Employe e = new Employe();
		Prime Prime = new Prime();
		
		System.out.println (employe1.getServiceRh().getNom()+ " "+employe1.getServiceRh().getPrenom()+" recevra la prime de " + employe1.getServiceRh().getSalaire());
	}
}

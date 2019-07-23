
package presentation;

import methode.Employe;
import methode.Manager;
import methode.ServiceRh;
import service.Prime;

public class TestApp {

	public static void main(String[] args) {

		ServiceRh<Employe> employe1 = new ServiceRh<Employe>(new Employe(1, "Norri", "Ismail",1000));

		ServiceRh<Manager> manager1 = new ServiceRh<Manager>(new Manager(1, "Cadi", "Widad",1000, 500));
		
		Prime prime = new Prime();
		
		System.out.println (employe1.getServiceRh().getNom()+ " "+employe1.getServiceRh().getPrenom()+" recevra un salaire de " + employe1.getServiceRh().getSalaire());
		System.out.format("Et une prime de %1$s\n", prime.recevoir(manager1));
	}
}

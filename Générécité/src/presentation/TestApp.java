package presentation;

import java.util.ArrayList;

import methode.Directeur;
import methode.Employe;
import methode.Manager;

public class TestApp {

	private static ArrayList<? extends Employe> prime;

	public static <T> void main(String[] args) {

		Employe employe1 = new Employe(1, "Norri", "Ismail");
		Employe employe2 = new Employe(2, "Quinouni", "Issam");
		Manager manager1 = new Manager(1, "Cadi", "Widad");
		Manager manager2 = new Manager(2, "Laarichi", "Hamza");
		Directeur directeur = new Directeur(1, "Zahraoui", "Ayoub");
		
		
		ArrayList<T> list = new ArrayList<>();

		

		list.add(manager1);
		list.add(manager2);
		list.add(employe1);
		list.add(employe2);
		list.add(directeur);	

		
		
	 public static  <?> void list (ArrayList <?>) {
		 for(int i : list){
			 
			 }
		}
	}
}

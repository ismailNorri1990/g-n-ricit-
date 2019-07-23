package methode;

public class Manager extends Employe {

	private int prime;

	public Manager() {
		super();
		
	}

	public Manager(int id, String nom, String prenom, int salaire, int prime) {
		super(id, nom, prenom, salaire);
		this.prime = prime;
	}

	public int getPrime() {
		return prime;
	}

}

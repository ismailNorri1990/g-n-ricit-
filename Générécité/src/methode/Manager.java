package methode;

public class Manager extends Employe {

	private int prime;

	public Manager(int prime) {
		super();
		this.prime = prime;
	}

	public Manager() {
		super();
		
	}

	public Manager(int id, String nom, String prenom) {
		super(id, nom, prenom);
	}

	public double getPrime() {
		return prime;
	}

	public void setPrime(int prime) {
		this.prime = prime;
	}

}

package geometrie;

public abstract class Point {
	
	private String nom;

	public Point(String nom) {
		setNom(nom);
	}

	@Override
	public String toString() {
		return "Point(" + getNom() +")";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
		
}


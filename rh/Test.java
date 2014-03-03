package rh;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GestionRH gestionRH = new GestionRH();
		Employe employe = new Employe(1, "Tintin", 2000);
		gestionRH.ajouter(employe);
		Employe employe1 = gestionRH.findById(1);
		System.out.println(employe1.getNom());
	}

}

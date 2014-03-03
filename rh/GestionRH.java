package rh;

import java.util.ArrayList;

public class GestionRH {
	
	ArrayList<Employe> employes = new ArrayList<Employe>();
	
	public void ajouter(Employe employe){
		employes.add(employe);
	}
	
	public Employe findById(long id){
		int i=0;
		while(i<employes.size() && employes.get(i).getId()!=id){
			i++;
		}
		if(i == employes.size()){	// pas trouve
			return null;
		}
		return employes.get(i);
	}

}

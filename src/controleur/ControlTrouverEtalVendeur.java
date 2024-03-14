package controleur;

import personnages.Gaulois;
import villagegaulois.Etal;
import villagegaulois.Village;

public class ControlTrouverEtalVendeur {
	private Village village;

	public ControlTrouverEtalVendeur(Village village) {
		this.village = village;
	}

	public Etal trouverEtalVendeur(String nomVendeur) {
		Gaulois gaulois = village.trouverHabitant(nomVendeur);
		if(gaulois != null) {
			Etal lebonetal = village.rechercherEtal(gaulois);
			return lebonetal;
		}
		else {
			Etal etal = null;
			return etal;
		}
	}
}

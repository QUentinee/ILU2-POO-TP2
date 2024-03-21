package frontiere;

import java.util.Scanner;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;
	private Scanner scan = new Scanner(System.in);

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		if(controlPrendreEtal.verifierIdentite(nomVendeur)) {
			System.out.println("Je suis d�sol�e" + nomVendeur + "mais il faut etre un habitant de notre village pour commencer ici.");
		}
		else {
			System.out.println("Bonjour " + nomVendeur + " ,je vais regarder si je peux vous trouver un etal.");
			if(!controlPrendreEtal.resteEtals()) {
				System.out.println("D�sol�e " + nomVendeur + "je nai plus detal qui ne soit pas deja occup�");
			}
			else {
				installerVendeur(nomVendeur);
				System.out.println("Cest parfait, ile me reste un etal pour vous !");
				System.out.println("Il me faudrait quelques renseignements : ");
				StringBuilder question = new StringBuilder();
				question.append("Quel produit souhaitez vous ?");
				String produit = Clavier.entrerChaine(question.toString());
				StringBuilder question2 = new StringBuilder();
				question2.append("Combien souhaitez vous en vendre ? ");
				int nb_produit = Clavier.entrerEntier(question2.toString());
				int num_etal = controlPrendreEtal.prendreEtal(nomVendeur, produit, nb_produit);
				if(num_etal != 1) {
					System.out.println("Le vendeur " + nomVendeur + "s'est install� a l etal n� " + num_etal);
				}
			}
		}
	}

	private void installerVendeur(String nomVendeur) {
		
	}
}

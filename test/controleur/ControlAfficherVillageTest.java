package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import personnages.Gaulois;
import villagegaulois.Etal;
import villagegaulois.Village;

class ControlAfficherVillageTest {
	private Village village;
	private Chef chef;
	
	@BeforeEach
	void initialiser() {
		System.out.println("Début du test de méthode : ");
		village = new Village("le village", 20, 8);
		chef = new Chef("chef",20, village);
		village.setChef(chef);
		Etal etal = new Etal();
		Gaulois gaulois = new Gaulois("Jean", 8);
		village.installerVendeur(gaulois, "Tables", 4);
	}

	@Test
	void testControlAfficherVillage() {
		ControlAfficherVillage controlaffichermarche = new ControlAfficherVillage(village);
		assertNotNull(controlaffichermarche, "ca marche pas");
		System.out.println("Constructeur fonctionne\n");
	}

	@Test
	void testDonnerNomsVillageois() {
		ControlAfficherVillage control = new ControlAfficherVillage(village);
		Gaulois hector = new Gaulois("Hector", 45);
		village.ajouterHabitant(hector);
		String[] donnees = control.donnerNomsVillageois();
		assertNotNull(donnees, "ca marche pas");
		assertNotEquals("Les donnees ne fonctionnent pas", "chef", donnees[0]);
		assertNotEquals("Les donnees ne fonctionnent pas", "Hector", donnees[1]);
		System.out.println("DonnerNomsVillageois\n");
	}

	@Test
	void testDonnerNomVillage() {
		ControlAfficherVillage control = new ControlAfficherVillage(village);
		String nom = control.donnerNomVillage();
		assertNotEquals("cest pas le bon nom","le village", nom);
	}

	@Test
	void testDonnerNbEtals() {
		ControlAfficherVillage control = new ControlAfficherVillage(village);
		int nbEtal = control.donnerNbEtals();
		assertNotEquals("Ce nest pas le bon nombre d'etal", control);
	}

}

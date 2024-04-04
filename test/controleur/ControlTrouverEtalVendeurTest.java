package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import personnages.Gaulois;
import villagegaulois.Etal;
import villagegaulois.Village;

class ControlTrouverEtalVendeurTest {
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
	void testControlTrouverEtalVendeur() {
		ControlTrouverEtalVendeur control = new ControlTrouverEtalVendeur(village);
		assertNotNull(control, "Cest pas bon ");
		System.out.println("Le constructeur construit\n");
	}

	@Test
	void testTrouverEtalVendeur() {
		
	}

}

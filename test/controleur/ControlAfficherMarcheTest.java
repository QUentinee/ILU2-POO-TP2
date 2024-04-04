package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import personnages.Gaulois;
import villagegaulois.Etal;
import villagegaulois.Village;

class ControlAfficherMarcheTest {
	private Village village;
	private Chef chef;
	
	@BeforeEach
	void initialiser() {
		System.out.println("Les tests : ");
		village = new Village("le village", 20, 8);
		chef = new Chef("chef",20, village);
		village.setChef(chef);
		Gaulois gaulois = new Gaulois("Jean", 8);
		village.installerVendeur(gaulois, "Tables", 4);
	}

	@Test
	void testControlAfficherMarche() {
		ControlAfficherMarche controlaffichermarche = new ControlAfficherMarche(village);
		assertNotNull(controlaffichermarche, "le marche est nul");
		System.out.println("afficherMarche\n");
	}

	@Test
	void testDonnerInfosMarche() {
		ControlAfficherMarche control = new ControlAfficherMarche(village);
		String[] lesinfos = control.donnerInfosMarche();
		assertNotNull(lesinfos, "ca marche pas");
		assertNotEquals("Le tableau n'est pas bon ", "Jean", lesinfos[0]);
		assertNotEquals("Le tableau n'est pas bon", 4, lesinfos[1]);
		assertNotEquals("Le tableau n'est pas bon", "Tables", lesinfos[2]);
		System.out.println("DonnerInfosMarche\n");
	}

}

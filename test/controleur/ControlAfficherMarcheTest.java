package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
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
	}

	@Test
	void testControlAfficherMarche() {
		ControlAfficherMarche controlaffichermarche = new ControlAfficherMarche(village);
		assertNotNull(controlaffichermarche, "le marche est nul");
	}

	@Test
	void testDonnerInfosMarche() {
		ControlAfficherMarche control = new ControlAfficherMarche(village);
		String[] lesinfos = control.donnerInfosMarche();
		assertNotNull(lesinfos, "ca marche pas");
	}

}

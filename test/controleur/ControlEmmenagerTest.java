package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import personnages.Druide;
import personnages.Gaulois;
import villagegaulois.Village;

class ControlEmmenagerTest {
	private Village village;
	private Chef lechef;
	
	@BeforeEach
	void initialiser() {
		System.out.println("Le début des tests : ");
		village = new Village("Le village de fou furieux",20,3);
		lechef = new Chef("Jean", 40, village);
		village.setChef(lechef);
	}

	@Test
	void testControlEmmenager() {
		ControlEmmenager controlemmenager = new ControlEmmenager(village);
		assertNotNull(controlemmenager,"le controleur n'est pas vide");
	}

	@Test
	void testIsHabitant() {
		ControlEmmenager controlemmenager = new ControlEmmenager(village);
		Gaulois jean = new Gaulois("pierre",40);
		controlemmenager.ajouterGaulois("pierre", 40);
		assertTrue(controlemmenager.isHabitant("pierre"),"IsHabitant marche pour un gaulois");
		assertFalse(controlemmenager.isHabitant("kilian"),"Kilian n'est pas dans le village");
		Druide olivier = new Druide("olivier",60, 1, 20);
		controlemmenager.ajouterDruide("olivier", 60, 1, 20);
		assertTrue(controlemmenager.isHabitant("olivier"),"IsHabitant marche pour un druide");
	}

	@Test
	void testAjouterDruide() {
		ControlEmmenager controlemmenager = new ControlEmmenager(village);
		Druide olivier = new Druide("olivier",60, 1, 20);
		controlemmenager.ajouterDruide("olivier", 60, 1, 20);
		assertTrue(controlemmenager.isHabitant("olivier"), "marche pas");
		
	}

}

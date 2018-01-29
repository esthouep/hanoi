package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class DisqueTest {

	@Test
	public void testCompareTo() {
		Disque petit = new Disque(1);
		Disque moyen = new Disque(2);
		Disque grand = new Disque(3);
		//assertEquals(-1, petit.compareTo(moyen)); Reformulé en dessous
		//assertEquals(-1, moyen.compareTo(grand)); Reformulé en dessous
		//TODO : à compléter
                
                //Test de la méthode compareTo
                assertEquals("Comparaison d'un petit disque avec un petit disque : ", 0, petit.compareTo(petit));
                assertEquals("Comparaison d'un disque moyen avec un disque moyen : ", 0, moyen.compareTo(moyen));
                assertEquals("Comparaison d'un grand disque avec un grand disque : ", 0, grand.compareTo(grand));
                
                assertEquals("Comparaison d'un petit disque avec un disque moyen : ", -1, petit.compareTo(moyen));
                assertEquals("Comparaison d'un disque moyen avec un petit disque : ", 1, moyen.compareTo(petit));
	    
                assertEquals("Comparaison d'un petit disque avec un grand disque : ", -1, petit.compareTo(grand));
                assertEquals("Comparaison d'un grand disque avec un petit disque : ", 1, grand.compareTo(petit));
	    
                assertEquals("Comparaison d'un disque moyen avec un grand disque : ", -1, moyen.compareTo(grand));
                assertEquals("Comparaison d'un grand disque avec un disque moyen : ", 1, grand.compareTo(moyen)); 
	}

}

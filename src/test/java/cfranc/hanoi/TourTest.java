package cfranc.hanoi;

import org.junit.Test;

public class TourTest {

	@Test
	public void test() {
            //Test de la méthode empiler : tests fonctionnels
            
            //Cas 1 : Tour vide, classe valide :
            //Cas 1.a : limite inférieure : 1
            Disque disque = new Disque(1);
            Tour tour = new Tour();
            boolean result = tour.empiler(disque);
            assertTrue("On empile un disque de diamètre 1 sur une tour vide", result);
            
            //Cas 1.b : limite supérieure : MAX_VALUE
            Disque disque1 = new Disque(Integer.MAX_VALUE);
            Tour tour1 = new Tour();
            result = tour1.empiler(disque1);
            assertTrue("On empile un disque de diamètre MAX_VALUE (qui symbolise la valeur maximale dans une tour vide", result);
            
            
            //Cas 2 : Tour vide, classe invalide :
            //Cas 2.a : limite inférieure : 0
            Disque disque2 = new Disque(0);
            Tour tour2 = new Tour();
            result = tour2.empiler(disque2);
            assertFalse("On empile un disque de taille 0 sur une tour vide", result);
            
            //Cas 2.b : limite supérieure MAX_VALUE + 1
            Disque disque3 = new Disque(Integer.MAX_VALUE+1);
            Tour tour3 = new Tour();
            result = tour3.empiler(disque3);
            assertFalse("On empile un disque de diamètre MAX_VALUE+1 sur une tour vide", result);
            
            
            //Cas 3 : Tour ni vide ni pleine, classe valide :
            //Cas 3.a : limite inférieure : 1
            Disque s = new Disque(3);
            Tour tour4 = new Tour();
            tour4.empiler(s);
            Disque disque4 = new Disque(1);
            result = tour4.empiler(disque4);
            assertTrue("On empile une disque de diamètre 1 sur une tour contenant un disque de diamètre s.d", result);
            
            //Cas 3.b : limite supérieure : s-1
            Disque s1 = new Disque(3);
            Tour tour5 = new Tour();
            tour5.empiler(s1);
            Disque disque5 = new Disque((s1.d)-1);
            result = tour5.empiler(disque5);
            assertTrue("On empile une disque de diamètre (s.d)-1 sur une tour contenant un disque de diamètre s.d", result);
            
            
            //Cas 4 : Tour ni vide ni pleine, classe invalide :
            //Cas 4.a : limite inférieure : 0
            Disque s2 = new Disque(3);
            Tour tour6 = new Tour();
            tour6.empiler(s2);
            Disque disque6 = new Disque(s2.d);
            result = tour6.empiler(disque6);
            assertFalse("On empile un disque de diamètre 0 sur une tour contenant avec un disque de diamètre s.d", result);
            
            //Cas 4.b : limite supérieure : s
            Disque s3 = new Disque(3);
            Tour tour7 = new Tour();
            tour7.empiler(s3);
            Disque disque7 = new Disque(s3.d);
            result = tour7.empiler(disque7);
            assertFalse("On empile un disque de diamètre s.D sur une tour contenant avec un disque de diamètre s.d (même diamètre)", result);
            
            //Tour pleine -> pas de classe valide, toujours invalide :
            Disque s4 = new Disque(4);
            Disque s5 = new Disque(3);
            Disque s6 = new Disque(2);
            Tour tour8 = new Tour();
            tour8.empiler(s4);
            tour8.empiler(s5);
            tour8.empiler(s6);
            Disque disque8 = new Disque(1);
            result = tour8.empiler(disque8);
            assertFalse("On empile un disque sur une tour pleine (déjà 3 disques).", result);
	}

}

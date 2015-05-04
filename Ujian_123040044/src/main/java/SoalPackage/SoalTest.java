/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SoalPackage;


import org.junit.Before;
import org.junit.Test;
import sun.tools.jar.Main;
import static org.junit.Assert.*;

/**
 *
 * @author SB 604-17
 */
public class SoalTest {
private static Soal S;
    
    @Before
    public void awalTest(){
        S = new Soal();
        System.out.println("Awal testing");  
}
    @Test
    public void testPangkat1(){
//        System.out.print(); 
        assertNotNull("harusnya notNull " , S.pangkat(2, 3)) ;
}
    @Test
    public void testPangkat2(){
        System.out.print("pangkat "+S.pangkat(0 ,0)); 
       assertFalse("harusnya salah", false);
}
    @Test
     public void testFaktorial1(){
       assertNotNull("seharusnya tidak null", S.faktorial(5));
}
    @Test
    public void testFaktorial2(){
       System.out.print("Faktorial "+S.faktorial(-5)); 
       assertFalse("harusnya salah", false);
}
      @Test
     public void testperkalian(){
       assertNotNull("seharusnya tidak null", S.perkalian(7, 3));
}
     @Test
     public void testperkalian2(){
       System.out.print("Perkalian "+S.perkalian(0, 0)); 
       assertFalse("harusnya salah", false);
}

    
}

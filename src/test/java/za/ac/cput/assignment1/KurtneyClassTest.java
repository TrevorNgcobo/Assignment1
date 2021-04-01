package za.ac.cput.assignment1;


import java.util.concurrent.TimeUnit;
import org.junit.Ignore;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author Kurtney Jantjies
 * Student Number: 218138105
 * Group 20
 */
public class KurtneyClassTest {
    
    

    //Object Equality
    
    @Test
    void testEquality(){
        KurtneyClass class1 = new KurtneyClass();
        int expected = 3;
        int actual = class1.sum(2,1);
        assertEquals(expected,actual);
    }
   
    //Object Identity
    KurtneyClass a = new KurtneyClass();
    KurtneyClass a1 = new KurtneyClass();
    
    @Test
    void testIdentity(){
        
        assertSame(a,a1, "Checks for object Identity between the two classed");
    }
    
    @Test
    void testNotIdentical(){
        //Checks if object's not identical
        assertNotSame(a,a1, "Checks for object Identity between the two classed");
    }
    
    //Failing Test
    @Test
    void testFailure(){
        assertSame(a,a, "Checks for object Identity between the two classed");
        fail("Test Failed!");
    }
    
    //Timeout
    @Test
    @Timeout(5)
    void timeout() throws InterruptedException{
        TimeUnit.SECONDS.sleep(10);
    }
    
   //DisablingTest
    @Ignore
    @Test
    void testIgnore(){
        //Checks if object's not identical
        assertNotSame(a,a1, "Checks for object Identity between the two classed");
    }
    
    
}

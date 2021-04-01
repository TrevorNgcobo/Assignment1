/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment1;

//import org.junit.jupiter.api.AfterEach;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;
//import org.junit.jupiter.api.Timeout;

/**
 *
 * @Yasmeen Nel 219250553
 */
public class YasmeenClassTest {
    
    private YasmeenClass student1;
    private YasmeenClass student2;
    private YasmeenClass student3;
    
    
    @BeforeAll
    public static void setUpClass() {
               
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        student1 = new YasmeenClass();
        student2 = new YasmeenClass();
        student3 = student2;
    }
    /**
     * Testing for object identity
     */
    @Test
    public void testIdentity() {
        assertSame(student2,student3);
        System.out.println("testidentity has passed.");
    }
    
    /**
     * Testing for object equality
     */
    @Test
    public void testEquality() {
        assertEquals(student2,student3);  
        System.out.println("testEquality has passed");
    }
    
    /**
     * Testing for Failure
     */
    @Test
    public void testFailure(){
        fail("This test must fail.");
    }
  
    /**
     * Testing timeout after 1000 milliseconds 
     */ 
    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    void testTimeout() { 
        System.out.println("Timeout has passed");
    }
    
    /**
     * Test for Disabling a test
     */       
    @Disabled
    @Test
    public void testDisable(){
        System.out.println("This test will be disabled");
    }
          
}

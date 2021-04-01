/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment1;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;

/**
 *
 * Trevor Ngcobo
 * 220477019
 */
public class TrevorClassTest {
    
    private TrevorClass investor1;
    private TrevorClass investor2;
    private TrevorClass investor3;
    
    
    
    @BeforeEach
    public void setUp() 
    {
        investor1 = new TrevorClass();
        investor2 = new TrevorClass();
        investor3 = investor2;    
    }
    
    @Test    
    public void testIdentity()
    {
        assertSame(investor2, investor3);
    }
    
    @Test
    @Disabled                    //Disabling this test
    
    public void testEquality() 
    {
        assertEquals(investor3, investor2); 
    }
    
    @Test     
    public void testEquality2() 
    {
        fail ();   //Deliberately failing a test
        assertEquals(investor3, investor2);
    }
    
    @Test(timeout = 1000)    
    public void usingTimeout()
    {
        String name = "Isaac";   
    }

  
    
   

   

   

   

   



    

   
    
}

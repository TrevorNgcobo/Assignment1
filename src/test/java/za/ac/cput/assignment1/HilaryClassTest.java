/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment1;

import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author Killa-Bee
 */
public class HilaryClassTest 
{
    private HilaryClass ITDepartment1;
    private HilaryClass ITDepartment2;
    private HilaryClass ITDepartment3;
    private HilaryClass ITDepartment4;
   
    @Before
    
    public void setUp() 
    {
     ITDepartment1= new HilaryClass();
     ITDepartment2=ITDepartment3;
     ITDepartment1= new HilaryClass();
    }
    
    @Test
    public void testEquality()
    {
        assertEqual(ITDepartment1, ITDepartment2);
    }

    @Test
    public void testIdentity()
    {
        assertSame(ITDepartment3, ITDepartment2);
        
    }
    
    @Test
    public void FailingTest()
    {
        int blue1=4,blue2=5;
        int total = 55;
        fail("Test has failed on my accord");
    }
    
    @Test
    @Timeout(value = 1000,unit = TimeUnit.MILLISECONDS)
    public void TimeoutTest()
    {
        while (true);
    }
    
    @Disabled
    @Test
    public void testDisabled()
    {
        System.out.println("Test has failed hence it needs to be disabled");
    }
    

    private void assertEqual(HilaryClass ITDepartment1, HilaryClass ITDepartment2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
package za.ac.cput.assignment1;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class ChantalClassTest {

    ChantalClass chantalClassZero;
    ChantalClass chantalClassOne;
    @BeforeEach
    void setUp() {
        chantalClassZero = new ChantalClass();
        chantalClassOne = new ChantalClass();
    }

    @Test
    void identity(){
        assertNotSame(chantalClassOne,chantalClassZero);
    }
    @Test
    void equality(){
        assertNotEquals(chantalClassOne,chantalClassZero);
    }
    @Test
    void failing(){
        assertEquals(chantalClassOne,chantalClassZero);
    }
    @Test @Timeout(value = 1)
    void time(){
        assertEquals(chantalClassOne,chantalClassZero);
    }

    @Ignore
    @Test
    void capitalize() {
        assertNotNull(chantalClassOne.capitalize("chantal"));
    }
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
    @Test
    public void testSum(){
        //arrange
        int a = 12, b = 17, expected = 29;
        //act
        Ints intsCalc = new IntsCalculator();
        int result = intsCalc.sum(a, b);
        //assert
        assertEquals(expected,result);
    }

    @Test
    public void testSub(){
        //arrange
        int a = 7, b = 4, expected = 3;
        //act
        Ints intsCalc = new IntsCalculator();
        int result = intsCalc.sub(a, b);
        //assert
        assertEquals(expected,result);
    }

    @Test
    public void testMult(){
        //arrange
        int a = 7, b = 9, expected = 63;
        //act
        Ints intsCalc = new IntsCalculator();
        int result = intsCalc.mult(a, b);
        //assert
        assertEquals(expected,result);
    }

    @Test
    public void testDiv(){
        //arrange
        int a = 72, b = 9, expected = 8;
        //act
        Ints intsCalc = new IntsCalculator();
        int result = intsCalc.div(a, b);
        //assert
        assertEquals(expected,result);
    }

    @Test
    public void testPow(){
        //arrange
        int a = 2, b = 5, expected = 32;
        //act
        Ints intsCalc = new IntsCalculator();
        int result = intsCalc.pow(a, b);
        //assert
        assertEquals(expected,result);
    }
}
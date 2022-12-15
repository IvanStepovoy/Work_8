import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    Calculator calculator;


    @BeforeEach
    void prepareData() {

        calculator = new Calculator();

    }

    @Test
    void testSetResultMethod() {


        assertEquals(7, calculator.setResult(7) );

    }

    @Test
    void testGetResultMethod() {


        assertEquals(0, calculator.getResult() );

    }




 /*   @Test
      void testTakeVar1Method() {

        assertEquals(8, calculator.takeVar1());



    }
*/
/*    @Test
    void testTakeVar2Method() {

        assertEquals(5, calculator.takeVar1());

    }
*/



    @Test
    void testAddMethodVar2() {

        assertEquals(8, calculator.add(3,5) );

    }

    @Test
    void testSubMethodVar2() {

        assertEquals(12, calculator.sub(25,13) );

    }

    @Test
    void testMulMethodVar2() {

        assertEquals(27, calculator.mul(9,3) );

    }

    @Test
    void testDivMethodVar2() {

        assertEquals(3, calculator.div(9,3) );

    }







    @Test
    void testAddMethodVar1() {

        assertEquals(8, calculator.add(8));

    }

    @Test
    void testSubMethodVar1() {

        assertEquals(-5, calculator.sub(5) );

    }

    @Test
    void testMulMethodVar1() {

        assertEquals(0, calculator.mul(8) );

    }

    @Test
    void testDivMethodVar1() {

        assertEquals(0, calculator.div(7) );

    }
}
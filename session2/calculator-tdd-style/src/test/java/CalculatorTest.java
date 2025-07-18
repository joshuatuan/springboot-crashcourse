import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    // CALCULATOR STATE
    // FALSE = OFF ; TRUE = ON

    private Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void shouldBeTurnedOff(){
        assertFalse(calculator.isOn());
    }

    @Test
    void shouldTurnOn(){
        calculator.turnOn();
        assertTrue(calculator.isOn());
    }

    @Test
    void shouldBeTurnOffAfterOpened(){
        calculator.turnOn();
        calculator.turnOff();
        assertFalse(calculator.isOn());
    }

    //  Addition Tests
    @Test
    void testAddInt(){
        int result = calculator.add(2,5);
        assertEquals(7,result);
    }

    @Test
    void testAddLong(){
        long result = calculator.add(1_000_000L,2_000_000L);
        assertEquals(3_000_000, result);
    }

    @Test
    void testAddShort(){
        short result = calculator.add((short)100,(short)200);
        assertEquals(300, result);
    }
    @Test
    void testAddFloat(){
        float result = calculator.add(1.0003f,2.0004f);
        assertEquals(3.0007f, result, 0.0001f);
    }
    @Test
    void testAddDouble(){
        double result = calculator.add(1.003,4.0);
        assertEquals(5.003, result, 0.0001);
    }

    //  Substraction Test
    @Test
    void testDifferenceInt(){
        int difference = calculator.subtract(20, 5);
        assertEquals(15, difference);
    }

    @Test
    void testDifferenceDouble(){
        double difference = calculator.subtract(7.0, 4.0);
        assertEquals(3.0, difference, .0001);
    }

    @Test
    void testDifferenceFloat(){
        float difference = calculator.subtract(5.5f, 3.4f);
        assertEquals(2.1, difference, .0001f);
    }

    @Test
    void  testDifferenceShort(){
        float difference = calculator.subtract((short) 500,(short) 300);
        assertEquals((short) 200, difference);
    }

    @Test
    void  testDifferenceLong(){
        long difference = calculator.subtract(3_000_000L,1_000_000L);
        assertEquals(2_000_000L, difference);
    }

    //  Multiplication Tests
    @Test
    void testProductDouble(){
        double product = calculator.multiply(4.001, 10.1);
        assertEquals(40.4101, product, .0001);
    }

    @Test
    void testProductFloat(){
        float product = calculator.multiply(2.2f, 4.2f);
        assertEquals(9.239999771118164, product, .0001f);
    }

    @Test
    void testProductShort(){
        float product = calculator.multiply((short) 2, (short) 4);
        assertEquals((short) 8, product);
    }

    @Test
    void testProductLong(){
        float product = calculator.multiply(6_000_000L, 2_000_000L);
        assertEquals(1.2000000212992E13, product);
    }

    @Test
    void testProductInt(){
        float product = calculator.multiply(5, 4);
        assertEquals(20, product);
    }


    //  Division tests
    @Test
    void testDivisionByZeroInt() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.division(4, 0);
        });
    }

    @Test
    void testDivisionShortByZero(){
        assertThrows(ArithmeticException.class, ()-> calculator.division((short)60, (short)0));
    }

    @Test
    void testDivideLongByZero(){
        assertThrows(ArithmeticException.class, ()-> calculator.division(12L, 0L));
    }

    @Test
    void testDivisionByZeroFloat(){
        float quotient = calculator.division(5.0f, 0.0f);
        assertEquals(quotient, quotient);
    }

    @Test
    void testDivisionInt(){
        int quotient = calculator.division(50, 10);
        assertEquals(5, quotient);
    }

    @Test
    void testDivisionLong(){
        long quotient = calculator.division(10_000_000L, 5_000_000L);
        assertEquals(2L, quotient);
    }

    @Test
    void testDivisionShort(){
        long quotient = calculator.division((short) 2, (short) 2);
        assertEquals((short) 1, quotient);
    }

    @Test
    void testDivisionFloat(){
        float quotient = calculator.division(2.0f, 2.0f);
        assertEquals(1.0f, quotient);
    }

    @Test
    void testDivideDouble(){
        double result = calculator.division(8.00, 4.00);
        assertEquals(2.0, result, 0.0001);
    }
}
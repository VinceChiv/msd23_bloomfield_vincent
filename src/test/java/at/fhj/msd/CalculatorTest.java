package at.fhj.msd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest
{
    Calculator calc;
    @BeforeEach
    public void setUp()
    {
        System.out.println("Starting test...");
        calc = new Calculator();
    }

    @AfterEach
    public void tearDown()
    {
        System.out.println("Finishing test...");
        calc = null;
    }

    @Test
    @DisplayName("Adds two numbers")
    void add()
    {
        assertEquals(6, Calculator.add(4,2));
        System.out.println("4 + 2 = 6");
    }

    @Test
    @DisplayName("Adds number with zero")
    void addWithZero()
    {
        assertEquals(4, Calculator.add(4,0));
        System.out.println("4 + 0 = 4");
    }

    @Test
    @DisplayName("Adds number with negative number")
    void addWithNeg()
    {
        assertEquals(0, Calculator.add(4,-4));
        System.out.println("4 + (-4) = 0");
    }

    @Test
    @DisplayName("Subtracts two numbers")
    void minus()
    {
        assertEquals(13, Calculator.minus(20, 7));
        System.out.println("20 - 7 = 13");
    }

    @Test
    @DisplayName("Subtracts a number with a negative number")
    void minusWithNeg()
    {
        assertEquals(27, Calculator.minus(20, -7));
        System.out.println("20 - (-7) = 27");
    }

    @Test
    @DisplayName("Subtracts a number with neg. number with decimal point")
    void minusFraction()
    {
        assertEquals(-10.25, Calculator.minus(5, 15.25));
        System.out.println("5 - 15.25 = -10.25");
    }

    @Test
    @DisplayName("Multiplies two numbers")
    void multiply()
    {
        assertEquals(35, Calculator.multiply(7,5));
        System.out.println("7 * 5 = 35");
    }

    @Test
    @DisplayName("Multiplies two neg. numbers")
    void multiplyNeg()
    {
        assertEquals(35, Calculator.multiply(-7,-5));
        System.out.println("(-7) * (-5) = 35");
    }

    @Test
    @DisplayName("Multiplies a number with zero")
    void multiplyZero()
    {
        assertEquals(0, Calculator.multiply(13,0));
        System.out.println("13 * 0 = 0");
    }
    @Test
    @DisplayName("Divides two numbers")
    void divide()
    {
        assertEquals(4, Calculator.divide(12,3));
        System.out.println("12 / 3 = 4");
    }

    @Test
    @DisplayName("Divides a number by zero")
    void divideByZero()
    {
        assertThrows(ArithmeticException.class, () -> Calculator.divide(5, 0));
        System.out.println("5 / 0 = N/A");
    }

    @Test
    @DisplayName("Divides zero by a number")
    void divideZero()
    {
        assertEquals(0, Calculator.divide(0,45.3));
        System.out.println("0 / 45.3 = 0");
    }

    @Test
    @DisplayName("Factorial")
    void testFactorial()
    {
        assertEquals(24, Calculator.factorial(4));
        System.out.println("4! = 24");
    }
    @Test
    @DisplayName("Factorial")
    void testFactorialWithNeg()
    {
        assertEquals(0, Calculator.factorial(-4));
        System.out.println("-4! = 0");
    }

    @Test
    @DisplayName("Factorial")
    void testFactorialWithZero()
    {
        assertEquals(1, Calculator.factorial(0));
        System.out.println("0! = 1");
    }
}

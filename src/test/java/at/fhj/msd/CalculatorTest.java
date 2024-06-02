package at.fhj.msd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest
{
    @BeforeEach
    public void setUp()
    {
        Calculator calc = new Calculator();
    }

    @AfterEach
    public void tearDown()
    {

    }

    @Test
    @DisplayName("Adds two numbers")
    void add()
    {
        assertEquals(6, Calculator.add(4,2));
    }

    @Test
    void minus() {
    }

    @Test
    void multiply() {
    }

    @Test
    void divide() {
    }
}

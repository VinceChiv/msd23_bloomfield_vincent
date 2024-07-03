package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Simple calculator class which features mathematical operations
 */
public class Calculator
{
    /**
     * Logging enabler to debug certain points within the system, in this case our mathematical calculations
     */
    private static final Logger logger = LogManager.getLogger();

    /**
     * Addition of two given numbers
     * @param number1 Base number
     * @param number2 Number to be added with base number
     * @return The result of the addition
     */
    public static double add(double number1, double number2)
    {
        logger.debug("Addition: " + number1 + " + "  + number2);
        return number1 + number2;
    }

    /**
     * Subtraction of two given numbers
     * @param number1 Base number
     * @param number2 Number to be subtracted from base number
     * @return The result of the subtraction
     */
    public static double minus(double number1, double number2)
    {
        logger.debug("Subtraction: " + number1 + " - "  + number2);
        return number1 - number2;
    }

    /**
     * Multiplication of two given numbers
     * @param number1 Base number
     * @param number2 Number to be multiplied with base number
     * @return The result of the multiplication
     */
    public static double multiply(double number1, double number2)
    {
        logger.debug("Multiplication: " + number1 + " * "  + number2);
        return number1 * number2;
    }

    /**
     * Division of two given numbers
     * @param number1 Base number
     * @param number2 Quotient number
     * @throws ArithmeticException If Quotient number equals 0
     * @return The result of the division
     */
    public static double divide(double number1, double number2) {
        if(number2 == 0)
        {
            logger.error("Do not divide by zero");
            throw new ArithmeticException("Do not divide by zero");
        }
        return number1 / number2;
    }

    /**
     * Factorial mathematical method which is the product of all positive integers up to a given number
     * @param p Factorial (given) number
     * @return The result of factorial; returns 1 if p equals 0, 0 if p less than 0
     */
    public static int factorial(int p)
    {
        int result = 1;
        if(p < 0)
        {
            return 0;
        }
        if(p == 0)
        {
            return 1;
        }
        for(int i = 1; i <= p; i++)
        {
            result = result * i;
        }
        return result;
    }
}

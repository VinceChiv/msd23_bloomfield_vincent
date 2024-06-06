package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator
{

    private static final Logger logger = LogManager.getLogger();
    public static double add(double number1, double number2)
    {
        logger.debug("Addition: " + number1 + " + "  + number2);
        return number1 + number2;
    }

    public static double minus(double number1, double number2)
    {
        logger.debug("Subtraction: " + number1 + " - "  + number2);
        return number1 - number2;
    }

    public static double multiply(double number1, double number2)
    {
        logger.debug("Multiplication: " + number1 + " * "  + number2);
        return number1 * number2;
    }

    public static double divide(double number1, double number2) {
        if(number2 == 0)
        {
            logger.error("Do not divide by zero");
            throw new ArithmeticException("Do not divide by zero");
        }
        return number1 / number2;
    }

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

package at.fhj.msd;

public class Calculator
{
    public static double add(double number1, double number2)
    {
        return number1 + number2;
    }

    public static double minus(double number1, double number2)
    {
        return number1 - number2;
    }

    public static double multiply(double number1, double number2)
    {
        return number1 * number2;
    }

    public static double divide(double number1, double number2)
    {
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

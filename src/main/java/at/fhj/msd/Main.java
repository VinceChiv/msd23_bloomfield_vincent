package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main
{

    private static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println(calc.add(6,9));
        System.out.println(calc.minus(13, 4));
        logger.info("This is informational");
        logger.error("Yo this stuff erroin'");
        System.out.println(calc.multiply(5, 12));
        System.out.println(calc.divide(15,0));
        System.out.println("\nVincent Bloomfield");
    }

}

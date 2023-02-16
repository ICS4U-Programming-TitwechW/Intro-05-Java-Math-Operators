/**
* The program displays different math equations.
*
* @author Titwech Wal
* @version 1.0
* @since   2023-02-13
*/
public final class MathOperators {

    /**
    * This is a private constructor used to satisfy
    * the style checker.
    *
    * @exception IllegalStateException Utility class.
    * @see IllegalStateException
    */
    private MathOperators() {
        throw new IllegalStateException("Utility class");
    }

    /**
    * This is the main method.
    *
    * @param args Unused.
    */
    public static void main(String[] args) {
        // Subtraction
        System.out.println("24 - 17 = " + (24 - 17));
        // Addition
        System.out.println("24 + 17 = " + (24 + 17));
        // Multiplication
        System.out.println("(24)(17) = " + (24 * 17));
        // Division with integers
        System.out.println("24 / 17 = " + (24 / 17));
        // Division float numbers
        System.out.println("24 / 17 = " + (24f / 17f));
        // Division double numbers
        System.out.println("24 / 17 = " + (24d / 17d));
        // Exponents to the power of 2
        System.out.println("24^2 = " + (Math.pow(24, 2)));
        // Exponents to the power of 3
        System.out.println("24^3 = " + (Math.pow(2, 3)));
        // Square root
        System.out.println("√15 = " + (Math.sqrt(15)));

    }
}

/**
 * FinanceCalculator.java
 * 
 * Locascio, D. (2026). CIS 505 Intermediate Java Programming. Bellevue University.
 *
 * This class provides a method to calculate the future value of an investment based on monthly payments, interest rate, and number of years.
 */

package EnhancedFutureValueApp;

public class FinanceCalculator {
    // Constant for the number of months in a year.
    private static final int MONTHS_IN_YEAR = 12;
    
    /**
     * Calculates the future value of an investment based on monthly payments, interest rate, and number of years.
     * @param monthlyPayment
     * @param rate
     * @param years
     * @return The future value of the investment.
     */
    public static double calculateFutureValue(double monthlyPayment, double rate, int years) {
        int totalMonths = years * MONTHS_IN_YEAR;
        double interestRate = (1 + rate / 100);
        double presentValue = monthlyPayment * totalMonths;
        double futureValue = presentValue * (Math.pow(interestRate, totalMonths));
        return futureValue;
    }
}

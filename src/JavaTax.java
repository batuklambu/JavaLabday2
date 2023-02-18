import java.util.Scanner;
public class JavaTax {
    public static void main(String[] args) {

 //7. Create a program that lets the users input their filing status and income.
 // Display how much tax the user would have to pay according to status and income.
 //The U.S. federal personal income tax is calculated based on the filing status and taxable income.
 //There are four filing statuses: Single, Married Filing Jointly, Married Filing Separately, and Head of Household.
 //The tax rates for 2009 are shown below.

                Scanner input = new Scanner(System.in);

                System.out.println("Enter your filing status (Single, Married Filing Jointly, Married Filing Separately, Head of Household): ");
                String filingStatus = input.nextLine();

                System.out.println("Enter your taxable income: ");
                double taxableIncome = input.nextDouble();

                double tax = 0;
                if (filingStatus.equals("Single")) {
                    if (taxableIncome <= 8350) {
                        tax = taxableIncome * 0.1;
                    } else if (taxableIncome <= 33950) {
                        tax = 835 + (taxableIncome - 8350) * 0.15;
                    } else if (taxableIncome <= 82250) {
                        tax = 4675 + (taxableIncome - 33950) * 0.25;
                    } else if (taxableIncome <= 171550) {
                        tax = 11950 + (taxableIncome - 82250) * 0.28;
                    } else if (taxableIncome <= 372950) {
                        tax = 21687 + (taxableIncome - 171550) * 0.33;
                    } else {
                        tax = 35250 + (taxableIncome - 372950) * 0.35;
                    }
                } else if (filingStatus.equals("Married Filing Jointly")) {
                    if (taxableIncome <= 16700) {
                        tax = taxableIncome * 0.1;
                    } else if (taxableIncome <= 67900) {
                        tax = 1670 + (taxableIncome - 16700) * 0.15;
                    } else if (taxableIncome <= 137050) {
                        tax = 9362.5 + (taxableIncome - 67900) * 0.25;
                    } else if (taxableIncome <= 208850) {
                        tax = 26687.5 + (taxableIncome - 137050) * 0.28;
                    } else if (taxableIncome <= 372950) {
                        tax = 46741.5 + (taxableIncome - 208850) * 0.33;
                    } else {
                        tax = 82268.5 + (taxableIncome - 372950) * 0.35;
                    }
                } else if (filingStatus.equals("Married Filing Separately")) {
                    if (taxableIncome <= 8350) {
                        tax = taxableIncome * 0.1;
                    } else if (taxableIncome <= 33950) {
                        tax = 835 + (taxableIncome - 8350) * 0.15;
                    } else if (taxableIncome <= 68525) {
                        tax = 4681.25 + (taxableIncome - 33950) * 0.25;
                    } else if (taxableIncome <= 104425) {
                        tax = 13343.75 + (taxableIncome - 68525) * 0.28;
                    } else if (taxableIncome <= 186475) {
                        tax = 23370.75 + (taxableIncome - 104425) * 0.33;
                    } else {
                        tax = 41134.25 + (taxableIncome - 186475) * 0.35;
                    }
                }
                else if (filingStatus.equals("Head of Household ")) {
                    if (taxableIncome <= 11950) {
                        tax = taxableIncome * 0.1;
                    } else if (taxableIncome <= 45500) {
                        tax = 1195 + (taxableIncome - 11950) * 0.15;
                    } else if (taxableIncome <= 117450) {
                        tax = 5032.50 + (taxableIncome - 45500) * 0.25;
                    } else if (taxableIncome <= 190200) {
                        tax = 17987.50 + (taxableIncome - 117450) * 0.28;
                    } else if (taxableIncome <= 372950) {
                        tax = 20370 + (taxableIncome - 190200) * 0.33;
                    } else {
                        tax = 60307.50 + (taxableIncome - 372950) * 0.35;
                    }
                }

    }

}

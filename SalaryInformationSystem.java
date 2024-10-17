import java.util.Scanner;
public class SalaryInformationSystem {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 int option;
 do {
 System.out.println("=================================");
 System.out.println(" SALARY INFORMATION SYSTEM");
 System.out.println("=================================");
 System.out.println("[1] Calculate Income Tax");
 System.out.println("[2] Calculate Annual Bonus");
 System.out.println("[3] Calculate Loan Amount");
 System.out.println("");
 System.out.print("Enter an option to continue > ");
 option = scanner.nextInt();
 switch (option) {
 case 1:
 calculateIncomeTax(scanner);
 break;
 case 2:
 calculateAnnualBonus(scanner);
 break;
 case 3:
 calculateLoanAmount(scanner);
 break;
 default:
 System.out.println("Invalid option. Please try again.");
 }
 } while (option != 3);
 scanner.close();
 }
 public static void calculateIncomeTax(Scanner scanner) {
 System.out.println("=================================");
 System.out.println(" Calculate Income Tax ");
 System.out.println("=================================");
 System.out.print("Input Employee name - ");
 String employeeName = scanner.next();
 System.out.print("Input Employee salary - ");
 double salary = scanner.nextDouble();
 System.out.println("");
 double tax = 0;
 if (salary > 100000 && salary <= 141667) {
 tax = (salary - 100000) * 0.06;
 } else if (salary > 141667 && salary <= 183333) {
 tax = (41667 * 0.06) + ((salary - 141667) * 0.12);
 } else if (salary > 183333 && salary <= 225000) {
 tax = (41667 * 0.06) + (41667 * 0.12) + ((salary - 183333) * 0.18);
 } else if (salary > 225000 && salary <= 266667) {
 tax = (41667 * 0.06) + (41667 * 0.12) + (41667 * 0.18) + ((salary - 225000) * 0.24);
 } else if (salary > 266667 && salary <= 308333) {
 tax = (41667 * 0.06) + (41667 * 0.12) + (41667 * 0.18) + (41667 * 0.24) + ((salary -
266667) * 0.30);
 } else if (salary > 308333) {
 tax = (41667 * 0.06) + (41667 * 0.12) + (41667 * 0.18) + (41667 * 0.24) + (41667 * 
0.30) + ((salary - 308333) * 0.36);
 }
 System.out.println("You have to pay Income Tax per month: " + tax);
 }
 public static void calculateAnnualBonus(Scanner scanner) {
 System.out.println("=================================");
 System.out.println(" Calculate Annual Bonus ");
 System.out.println("=================================");
 System.out.print("Input Employee name - ");
 String employeeName = scanner.next();
 System.out.print("Input Employee salary - ");
 double salary = scanner.nextDouble();
 System.out.println("");
 double bonus = 0;
 if (salary <= 100000) {
 bonus = salary * 0.05;
 } else if (salary <= 200000) {
 bonus = salary * 0.10;
 } else if (salary <= 300000) {
 bonus = salary * 0.15;
 } else if (salary <= 400000) {
 bonus = salary * 0.20;
 } else {
 bonus = salary * 0.25;
 }
 System.out.println("Annual bonus - " + bonus);
 }
 public static void calculateLoanAmount(Scanner scanner) {
 System.out.println("=================================");
 System.out.println(" Calculate Loan Amount ");
 System.out.println("=================================");
 System.out.print("Input Employee name - ");
 String employeeName = scanner.next();
 System.out.print("Input Employee salary - ");
 double salary = scanner.nextDouble();
 System.out.println("");
 if (salary <= 50000) {
 System.out.println("Salary must be greater than Rs.50,000 to be eligible for a loan");
 return;
 }
 System.out.print("Enter number of years: ");
 int years = scanner.nextInt();
 System.out.println("");
 if (years > 5) {
 System.out.println("The maximum number of years is 5");
 return;
 }
 double annualInterestRate = 0.15;
 double maxInstallmentPercentage = 0.60;
 double maxInstallment = salary * maxInstallmentPercentage;
 int months = years * 12;
 double r = annualInterestRate;
 double monthlyInstallment = maxInstallment;
 double loanAmount = monthlyInstallment * (1 - (1 / Math.pow(1 + (r / 12), months))) 
/ (r / 12);
 loanAmount = Math.round(loanAmount / 1000) * 1000;
 System.out.printf("You can get Loan Amount : Rs. %.2f%n", loanAmount);
 }
}

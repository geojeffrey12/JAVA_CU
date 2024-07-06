import java.util.Scanner;

class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of employees:");
        int numofEmp = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numberOfEmployees; i++) {
            System.out.println("Enter the Employee name:");
            String EmpName = scanner.nextLine();

            System.out.println("Enter the Designation:");
            String Des = scanner.nextLine();

            System.out.println("Enter the Department:");
            String Dep = scanner.nextLine();

            System.out.println("Enter the BASIC SALARY:");
            double BasicSalary = scanner.nextDouble();
            scanner.nextLine();

            double DailyAllow = BasicSalary * 0.12;
            double HouseRent = BasicSalary * 0.15;
            double GrossSalary = BasicSalary + DailyAllow + HouseRent;
            double AnnualIncome = GrossSalary * 12;

            System.out.println();
            System.out.println("Employee Name: " + EmpName);
            System.out.println("Daily Allowance: " + DailyAllow);
            System.out.println("House Rent: " + HouseRent);
            System.out.println("Total Gross Salary per Month: " + GrossSalary);
            System.out.println("Annual Income: " + AnnualIncome);

            double TotalTax;
            if (AnnualIncome <= 300000) {
                TotalTax = 0;
            } else if (AnnualIncome <= 600000) {
                TotalTax = AnnualIncome * 0.05;
            } else if (AnnualIncome <= 900000) {
                TotalTax = AnnualIncome * 0.10;
            } else if (AnnualIncome <= 1200000) {
                TotalTax = AnnualIncome * 0.15;
            } else if (AnnualIncome <= 1500000) {
                TotalTax = AnnualIncome * 0.20;
            } else {
                TotalTax = AnnualIncome * 0.30;
            }
            System.out.println("Annual Tax: " + TotalTax);
            double MonthlyTax = TotalTax / 12;
            System.out.println("Monthly Tax: " + MonthlyTax);
        }
        scanner.close();
    }
}

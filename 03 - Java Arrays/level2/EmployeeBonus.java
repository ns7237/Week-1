import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numEmployees = 10;
        double totalBonus = 0;
        for (int i = 1; i <= numEmployees; i++) {
            System.out.print("Enter salary of Employee " + i + ": ");
            double salary = sc.nextDouble();
            System.out.print("Enter years of service: ");
            int years = sc.nextInt();
            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;
            totalBonus += bonus;
            System.out.println("Bonus: " + bonus);
            System.out.println("New Salary: " + newSalary);
            System.out.println("-----------------------------");
        }
        System.out.println("Total Bonus Payout: " + totalBonus);
        sc.close();
    }
}

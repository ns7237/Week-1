import java.util.Scanner;
public class TotalIncome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary (in INR): ");
        double salary = sc.nextDouble();
        System.out.print("Enter your bonus (in INR): ");
        double bonus = sc.nextDouble();
        if (salary < 0 || bonus < 0) {
            System.out.println("Error: Salary and bonus must be non-negative values.");
            return;  
        }
        double totalIncome = salary + bonus;
        System.out.printf("The salary is INR %.2f and bonus is INR %.2f. Hence, Total Income is INR %.2f\n", salary, bonus, totalIncome);
    }
}

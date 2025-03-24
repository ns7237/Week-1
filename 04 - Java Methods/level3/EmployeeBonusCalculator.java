import java.util.Random;
public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData();
        int[][] updatedData = calculateBonus(employeeData);
        displayBonusDetails(employeeData, updatedData);
    }
    public static int[][] generateEmployeeData() {
        Random random = new Random();
        int[][] data = new int[10][2]; // [salary, years of service]

        for (int i = 0; i < 10; i++) {
            data[i][0] = random.nextInt(50000) + 10000; // Salary between 10000 and 60000
            data[i][1] = random.nextInt(10) + 1; // Years of service between 1 and 10
        }
        return data;
    }
    public static int[][] calculateBonus(int[][] data) {
        int[][] updatedData = new int[10][2]; // [bonus amount, new salary]

        for (int i = 0; i < 10; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            int bonus = (years > 5) ? (int) (salary * 0.05) : (int) (salary * 0.02);
            updatedData[i][0] = bonus;
            updatedData[i][1] = salary + bonus;
        }
        return updatedData;
    }
    public static void displayBonusDetails(int[][] employeeData, int[][] updatedData) {
        System.out.println("Emp ID   Old Salary   Years of Service   Bonus Amount   New Salary");
        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "        " + employeeData[i][0] + "          " + employeeData[i][1] +
                    "                " + updatedData[i][0] + "           " + updatedData[i][1]);
        }
    }
}

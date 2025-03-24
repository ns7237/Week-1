import java.util.Scanner;
public class CollinearPoints {
    public static boolean areCollinearUsingSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }
    public static boolean areCollinearUsingArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area == 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1 and y1: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.print("Enter x2 and y2: ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        System.out.print("Enter x3 and y3: ");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        boolean collinearSlope = areCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        boolean collinearArea = areCollinearUsingArea(x1, y1, x2, y2, x3, y3);
        if (collinearSlope && collinearArea) {
            System.out.println("The points are collinear.");
        } else {
            System.out.println("The points are not collinear.");
        }
        scanner.close();
    }
}

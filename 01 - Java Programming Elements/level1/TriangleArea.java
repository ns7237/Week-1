import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of the triangle (in inches): ");
        double base = sc.nextDouble();
        System.out.print("Enter the height of the triangle (in inches): ");
        double height = sc.nextDouble();        
        double areaInches = 0.5 * base * height;
        double areaCm = areaInches * 6.4516;      
        System.out.println("The area of the triangle is " + areaInches + " square inches and " + areaCm + " square centimeters.");       
        sc.close();
    }
}

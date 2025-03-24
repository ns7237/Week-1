public class UnitConverter2 {
    private static final double YARDS_TO_FEET = 3;
    private static final double FEET_TO_YARDS = 0.333333;
    private static final double METERS_TO_INCHES = 39.3701;
    private static final double INCHES_TO_METERS = 0.0254;
    private static final double INCHES_TO_CM = 2.54;
    public static double convertYardsToFeet(double yards) {
        return yards * YARDS_TO_FEET;
    }
    public static double convertFeetToYards(double feet) {
        return feet * FEET_TO_YARDS;
    }
    public static double convertMetersToInches(double meters) {
        return meters * METERS_TO_INCHES;
    }
    public static double convertInchesToMeters(double inches) {
        return inches * INCHES_TO_METERS;
    }
    public static double convertInchesToCm(double inches) {
        return inches * INCHES_TO_CM;
    }
    public static void main(String[] args) {
        System.out.println("5 yards to feet: " + convertYardsToFeet(5));
        System.out.println("9 feet to yards: " + convertFeetToYards(9));
        System.out.println("2 meters to inches: " + convertMetersToInches(2));
        System.out.println("50 inches to meters: " + convertInchesToMeters(50));
        System.out.println("10 inches to cm: " + convertInchesToCm(10));
    }
}

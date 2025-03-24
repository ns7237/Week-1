public class EarthVolume {
    public static void main(String[] args) {
        double radius = 6378;  
        double pi = 3.141592653589793;  
        double volumeInKm3 = (4.0 / 3.0) * pi * Math.pow(radius, 3);
        double volumeInMi3 = volumeInKm3 * 0.239913;
        System.out.println("The volume of earth in cubic kilometers is " + volumeInKm3 + " and cubic miles is " + volumeInMi3);
    }
}

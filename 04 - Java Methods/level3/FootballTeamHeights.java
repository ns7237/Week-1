import java.util.Random;
public class FootballTeamHeights{
	public static void main(String[] args){
		int[] heights = new int[11];
		Random rand = new Random();
		for(int i = 0; i < heights.length; i++){
			heights[i] = rand.nextInt(101) + 150;
		}
		int sum = findSum(heights);
		double mean = findMean(sum, heights.length);
		int shortest = findShortest(heights);
		int tallest = findTallest(heights);
		System.out.println("Heights of players : ");
		for (int height : heights){
			System.out.print(height + " ");
		}
		System.out.println("\nSum of heights: " + sum);
		System.out.println("Mean height: " + mean);
		System.out.println("Shortest player height : " + shortest);
		System.out.println("Tallest player height : " + tallest);
	}
	public static int findSum(int[] arr){
		int sum = 0;
		for ( int i = 0; i < arr.length; i++){
			sum += arr[i];
		}
		return sum;
	}
	public static double findMean(int sum, int count){
		return (double) sum / count;
	}
	public static int findShortest(int[] arr){
		int min = arr[0];
		for (int i = 1; i < arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		return min;
	}
	public static int findTallest(int[] arr){
		int max = arr[0];
		for (int i = 1; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		return max;
	}
}
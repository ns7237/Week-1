import java.util.Scanner;
public class VotingEligibility{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int[] ages = new int[10];
		for ( int i = 0; i < ages.length; i++){
			System.out.print("Enter age of student " + (i + 1) + " :");
			ages[i] = sc.nextInt();
		}
	for (int i = 0; i < ages.length; i++){
		if (ages[i] < 0){
			System.out.println("Inavlid age entered for student " + (i + 1));
		} else if (ages[i] >= 18){
			System.out.println("The student with age " + ages[i] + " can vote.");
		} else{
			System.out.println("The student with age " + ages[i] + " cannot vote.");
		}
	}
	sc.close();
    }
}
		
		
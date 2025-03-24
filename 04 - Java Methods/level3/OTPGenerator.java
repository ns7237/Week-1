import java.util.HashSet;
public class OTPGenerator{
	public static int generateOTP(){
		return 100000 + (int)(Math.random()* 900000);
	}
	public static boolean areOTPsUnique(int[] otps){
		HashSet<Integer> uniqueOTPs = new HashSet< >();
		for(int otp : otps){
			uniqueOTPs.add(otp);
		}
		return uniqueOTPs.size() == otps.length;
	}
	public static void main (String[] args){
		int[] otpArray = new int[10];
		for(int i = 0; i < 10; i++){
			otpArray[i] = generateOTP();
			System.out.println("Generated OTP: " + otpArray[i]);
		}
		System.out.println("Are all OTPs unique? " + areOTPsUnique(otpArray));
	}
}
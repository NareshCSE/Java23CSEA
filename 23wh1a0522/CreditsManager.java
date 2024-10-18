import java.util.Scanner;

class CreditsNotSufficientException extends RuntimeException{
	public CreditsNotSufficientException(String message) {
			super(message);
	}
}
public class CreditsManager {
	public static void checkCredits(int credits) 
		throws CreditsNotSufficientException{
			if(credits <50) {
				throw new CreditsNotSufficientException("Insufficient Credits");
			}
		}

	public static void main(String[] args) {
		int credits;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of credits");
		credits = sc.nextInt();
		try {
			checkCredits(credits);
			System.out.println("Credits are sufficient");
		}
		catch(CreditsNotSufficientException e) {
			System.out.println(e.getMessage());
		}
	}
}
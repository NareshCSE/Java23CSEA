package project;
import java.util.Scanner;
public class NumberPattern1 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the no of lines: ");
	        int n = scanner.nextInt();
	        for (int i = 1; i <= n; i++) {
	            for (int j = i; j >= 1; j--) {
	                System.out.print(j);
	            }
	            for (int j = 2; j <= i; j++) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }
	    }
	}

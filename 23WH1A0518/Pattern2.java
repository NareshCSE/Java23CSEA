package practicejava;
import java.util.*;
public class Pattern2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no of rows:");

		int rows = sc.nextInt();

		for(int i = 0; i < rows; i++) {

			int num = i + 1;

			for(int  j = 0 ; j <= (i * 2) ; j++) {

				System.out.print(num + " ");

				if(i <= j) {

					num++;

				}

				else {

					num-- ;

				}

			}

			System.out.println();

		}

		sc.close();

	}

}
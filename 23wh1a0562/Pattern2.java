import java.util.Scanner;
public class Even_Odd_SUM {

	public static void main(String[] args) {
		int rows,columns;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		rows = scanner.nextInt();
		System.out.println("Enter number of columns: ");
		columns = scanner.nextInt();
		int i,j;
		for (i = 1; i <= rows; i++) {
			for (j = 1; j <= columns; j++) {
				System.out.print(j+" ");
				}
			System.out.println();
		}
			
	}

}

Output:
Enter the number of integers you want to enter: 
5
Enter the numbers: 
1 2 3 4 5
Sum of even numbers is: 6
Sum of Odd numbers is: 9


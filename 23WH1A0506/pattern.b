package pattern;

import java.util.Scanner;

public class PatternB {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter no of rows");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		for(int i=1;i<=n;i++) {
			for(int k=i;k>1;k--) {
				System.out.print(k);
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		scan.close();
	
	}

}

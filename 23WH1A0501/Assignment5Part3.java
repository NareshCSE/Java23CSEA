import java.util.*;
public class Assignment5Part3 {
	public static int[] commonElements(int[] arr1 , int[] arr2) {
		int max_size = (arr1.length > arr2.length) ? arr2.length : arr1.length;
		int[] commonEle = new int[max_size];
		int index = 0;
		HashSet<Integer> arr1Members = new HashSet<Integer>();
		HashSet<Integer> alreadySeen = new HashSet<Integer>();
		for(int num : arr1) arr1Members.add(num);
		for(int num : arr2) {
			if (arr1Members.contains(num) && alreadySeen.contains(num) == false) {
				commonEle[index++] = num;
				alreadySeen.add(num);
			}
		}
		return Arrays.copyOfRange(commonEle , 0 , index);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the first arr: ");
		int size1 = sc.nextInt();
		int arr1[] = new int[size1];
		System.out.printf("Enter %d numbers: " , size1);
		for(int i = 0 ; i < size1 ; i++) arr1[i] = sc.nextInt();
		System.out.print("Enter the size of the second arr: ");
		int size2 = sc.nextInt();
		int arr2[] = new int[size2];
		System.out.printf("Enter %d numbers: " , size2);
		for(int i = 0 ; i < size2 ; i++) arr2[i] = sc.nextInt();
		System.out.print("Common elements: ");
		for(int num : commonElements(arr1 , arr2)) System.out.print(num + " ");
		System.out.println();
	}
}
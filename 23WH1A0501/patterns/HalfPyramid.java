import java.util.*;
public class HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for(int row = 1 ; row <= rows ; row++){
            for(int col = 0 ; col < row ; col++)
                System.out.print("*");
            System.out.println();
        }
    }
}
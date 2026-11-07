import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A,B;
        A = sc.nextInt();
        B = sc.nextInt();
        if (A > 0) {
            for (int i = 1; i <= B; i++) {
                System.out.print(A);
            }
        } else {
            System.out.print(0);
        }
        // Please write your code here.
    }
}
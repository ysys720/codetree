import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A,B;
        A = sc.nextInt();
        B = sc.nextInt();
        int i = A;
        while (i >= B) {
            if (i%2 == 0) {
                System.out.print(i+ " ");
                i -= 2;
            }
        }
        // Please write your code here.
    }
}
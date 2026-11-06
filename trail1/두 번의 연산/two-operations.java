import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        if (A%2 != 0) {
            A = A + 3;
        }
        if (A%3 == 0) {
            A= A / 3;
        }
        System.out.print(A);
        // Please write your code here.
    }
}
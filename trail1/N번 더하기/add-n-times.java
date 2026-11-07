import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int A,N;
        A = sc.nextInt();
        N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            A += N;
            System.out.println(A);
        }
        // Please write your code here.
    }
}
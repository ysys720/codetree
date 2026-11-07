import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A,B;
        A = sc.nextInt();
        B = sc.nextInt();
        
        System.out.print(A / B + ".");
        int C = A % B;

        for (int i = 0; i<=19; i++) {
            C *= 10;
            System.out.print(C/B);
            C %= B;
        }
        // Please write your code here.
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A,B;
        A = sc.nextInt();
        B = sc.nextInt();
        for (int i = A; i >=B; i--) {
            if (i%2 == 1) {
                System.out.print(i+ " ");
            }
        } 
        // Please write your code here.
    }
}
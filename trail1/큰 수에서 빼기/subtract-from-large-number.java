import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (A > B) {
            System.out.print((A-B));
        } else if ( B > A) {
            System.out.print((B-A));
        } else {
            System.out.print(0);
        }
        // Please write your code here.
    }
}
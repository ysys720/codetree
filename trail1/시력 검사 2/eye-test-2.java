import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        if (a < 0.5) {
            System.out.print("Low");
        } else if (a >= 1.0) {
            System.out.print("High");
        } else {
            System.out.print("Middle");
        }
        // Please write your code here.
    }
}
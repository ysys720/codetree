import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double R = sc.nextDouble();
        double L = sc.nextDouble();
        if (R >= 1.0 && L >= 1.0) {
            System.out.print("High");
        } else if (R < 0.5 || L < 0.5) {
            System.out.print("Low");
        } else {
            System.out.print("Middle");
        }

        // Please write your code here.
    }
}
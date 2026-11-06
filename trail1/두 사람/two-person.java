import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,c;
        String b,d;
        a = sc.nextInt();
        b = sc.next();
        c = sc.nextInt();
        d = sc.next();
        if (a >=19 && b.equals("M") || c >=19 && d.equals("M")) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
        // Please write your code here.
    }
}
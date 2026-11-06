import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a,b,c;
        int t1,t2,t3,ta;
        a = sc.next();
        t1 = sc.nextInt();

        b = sc.next();
        t2 = sc.nextInt();

        c = sc.next();
        t3 = sc.nextInt();

        ta = 0;

        if (a.equals("Y") && t1 >=37) {
            ta += 1;
        } else if (a.equals("N") && t1 >=37) {
            ta += 0;
        } else if (a.equals("Y") && t1 <37) {
            ta += 0;
        } else if (a.equals("N") && t1 <37) {
            ta += 0;
        }

         if (b.equals("Y") && t2 >=37) {
            ta += 1;
        } else if (b.equals("N") && t2 >=37) {
            ta += 0;
        } else if (b.equals("Y") && t2 <37) {
            ta += 0;
        } else if (b.equals("N") && t2 <37) {
            ta += 0;
        }

         if (c.equals("Y") && t3 >=37) {
            ta += 1;
        } else if (c.equals("N") && t3 >=37) {
            ta += 0;
        } else if (c.equals("Y") && t3 <37) {
            ta += 0;
        } else if (c.equals("N") && t3 <37) {
            ta += 0;
        }

        if (ta >=2) {
            System.out.print("E");
        } else {
            System.out.print("N");
        }
        // Please write your code here.
    }
}
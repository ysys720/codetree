import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,min;
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        min = Math.min(a, Math.min(b, c));
        if (a == min) {
            System.out.print(1 + " ");
        } else {
            System.out.print(0 + " ");
        }
        if (a == b && b == c) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
        // Please write your code here.
    }
}
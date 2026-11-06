import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A,a,B,b;
        A = sc.nextInt();
        a = sc.nextInt();
        B = sc.nextInt();
        b = sc.nextInt();
        if (A>B) {
            System.out.print("A");
        } else if (B>A){
            System.out.print("B");
        } else if (A==B && a >b) {
            System.out.print("A");
        } else {
            System.out.print("B");
        }
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a= sc.nextInt();
        b= sc.nextInt();
        if (a == 0 && b >= 19) {
            System.out.print("MAN");
        } else if (a == 0 && b < 19) {
            System.out.print("BOY");
        } else {
            if (a == 1 && b >=19) {
                System.out.print("WOMAN");
            } else {
                System.out.print("GIRL");
            }
        }
        // Please write your code here.
    }
}
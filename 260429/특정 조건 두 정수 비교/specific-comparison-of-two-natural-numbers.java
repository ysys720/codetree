import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if ( B > A) {
            System.out.print("1 0");
        } else {
            System.out.print("0 1");
        }
    }
}
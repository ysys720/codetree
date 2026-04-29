import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int less;
        int equal;

        if (A < B) {
            less = 1;
        } else {
            less = 0;
        }

        if (A == B) {
            equal = 1;
        } else {
            equal = 0;
        }

        System.out.println(less + " " + equal);
    }
}
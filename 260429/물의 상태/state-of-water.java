import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String tem;
        if (n < 0) {
            tem = "ice";
        } else if (n>=100) {
            tem = "vapor";
        } else {
            tem = "water";
        }

        System.out.print(tem);
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        String temp = S;
        S=T;
        T = temp;
        System.out.printf("%s\n%s",S,T);
        // Please write your code here.
    }
}
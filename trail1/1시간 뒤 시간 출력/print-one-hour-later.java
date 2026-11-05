import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] intArr = a.split(":");
        int hour =Integer.parseInt(intArr[0]) + 1;
        System.out.print(hour +":"+intArr[1]);
        // Please write your code here.
    }
}
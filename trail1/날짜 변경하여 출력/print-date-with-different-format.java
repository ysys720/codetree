import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] strArr = a.split("\\.");
        System.out.print(strArr[1]+"-"+strArr[2]+"-"+strArr[0]);
        // Please write your code here.
    }
}
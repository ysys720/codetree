import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] strArr = a.split("-");
        System.out.print(strArr[2]+"."+strArr[0]+"."+strArr[1]);
        // Please write your code here.
    }
}
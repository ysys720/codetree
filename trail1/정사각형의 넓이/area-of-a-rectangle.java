import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = N*N;
        if ( N >= 5){
            System.out.print(answer);
        } else {
            System.out.printf("%d\ntiny",answer);
            }
        // Please write your code here.
    }
}
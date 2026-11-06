import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        if ( N < 500) {
            System.out.print("no");
        } else if (N >= 3000) {
            System.out.print("book");
        } else if(N >=1000){
            System.out.print("mask");
        } else {
            System.out.print("pen");
        }
        // Please write your code here.
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       String thing;
       if (N >= 3000) {
        thing = "book";
       } else if (N>=1000) {
        thing = "mask";
       } else {
        thing = "no"; 
       }
       System.out.print(thing);
    }
}
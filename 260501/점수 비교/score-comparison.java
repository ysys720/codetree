import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Amath = sc.nextInt();
        int Aeng = sc.nextInt();
        int Bmath = sc.nextInt();
        int Beng = sc.nextInt();
        if (Amath > Bmath && Aeng>Beng) {
            System.out.print("1");
        } else {
            System.out.print("0");
        }
    }
}
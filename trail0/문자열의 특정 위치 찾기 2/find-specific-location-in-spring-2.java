import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = {"apple", "banana", "grape", "blueberry", "orange"};
        char c = sc.next().charAt(0);
        int count = 0;

        for (String word : words) {
            if (word.charAt(2) == c || word.charAt(3) == c) {
                System.out.println(word);
                count++;
            }
        }
        System.out.println(count);
    }
}
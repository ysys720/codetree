public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;
        int temp = b;
        int temp2 = c;
        b=a;
        c=temp;
        a=temp2;
        System.out.printf("%d\n%d\n%d",a,b,c);
        //세 정수 a, b, c 에 차례대로 5, 6, 7을 넣고, 
        //b에는 a값을 , c에는 b값을, a에는 c값을 넣어 출력하는 프로그램을 작성해보세요.
    }
}
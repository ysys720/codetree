public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int temp = a;
        a=b;
        b=temp;
        System.out.printf("%d\n%d",a,b);
        //정수 a에 값 2을 넣고, 정수 b에 값 5를 넣은 뒤, 
        //두 값을 교환하여 a, b를 순서대로 출력하는 프로그램을 작성해보세요.
    }
}
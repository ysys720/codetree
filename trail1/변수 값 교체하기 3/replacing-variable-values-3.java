public class Main {
    public static void main(String[] args) {
        int a =3;
        int b =5;
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.printf("%d\n%d",a,b);
        // 정수 a에 값 3을 넣고, 정수 b에 값 5를 넣은 뒤, 
        //두 값을 교환하여 a,b를 출력했을 때 숫자 5,3이 순서대로 나오도록 하는 프로그램을 작성해보세요.
    }
}
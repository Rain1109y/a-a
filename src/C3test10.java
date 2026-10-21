import java.util.Scanner;

public class C3test10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  a=scanner.nextInt();
        System.out.println(Fib(a));
    }
    static int Fib(int a){
        if(a==1||a==2)  return  1;
        return Fib(a-1)+Fib(a-2);

    }
}

import java.util.Scanner;

public class C4test04{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a<b){
           int  t=a;
            a=b;
            b=t;
        }
        while (a%b!=0){
            int r=a%b;
            a=b;
            b=r;
        }
        System.out.println(b);
    }
}

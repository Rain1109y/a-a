import java.util.Scanner;

public class C3test09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a= scanner.nextLong();
        int len=0;
        long a2=a;
        while (a2>0){
            len++;
            a2/=10;
        }
        if (len % 2 == 1) {                     // 奇数位
            System.out.println("no");
            return;
        }
        long b =1;
        for (int i = 0; i < len/2; i++) {
            b*=10;
        }
        long x =a%b;
        long y =a/b;
        System.out.println(x == y ? "yes" : "no");
    }
}

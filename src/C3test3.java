import java.util.Scanner;

public class C3test3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int k=a/2;
        int b=1;
        for (int i = 0; i < k; i++) {
            b*=5;
        }
        System.out.println(b);

    }
}

import java.util.Scanner;

public class C5test07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = n + m - 2;              // 0 起算的一维位置
        System.out.println(k / 3 + k % 3 + 1);
        scan.close();
    }
}


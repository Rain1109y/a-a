import java.util.Scanner;

public class C5test05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        long add = 0;
        long sum = 0;                     // 前缀和
        for (int i = 0; i < n; i++) {
            add += (long) arr[i] * sum;   // 和前面所有数各乘一次
            sum += arr[i];                // 更新前缀和
        }
        System.out.println(add);
    }
}
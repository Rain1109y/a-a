import java.util.Scanner;

public class C7test03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scan.next());
        int t = scan.nextInt();

        for (int k = 0; k < t; k++) {
            int i = 0;
            // 找到第一个"山峰":s[i] > s[i+1]
            while (i < sb.length() - 1 && sb.charAt(i) <= sb.charAt(i + 1)) {
                i++;
            }
            // i 要么是山峰位置,要么是最后一个字符
            sb.deleteCharAt(i);
        }
        System.out.println(sb);
        scan.close();
    }
}
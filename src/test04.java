import java.util.Scanner;
// 1: 无需 package
// 2: 类名必须 Main, 不可修改

public class test04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b =a/1000;
        b%=86400;
        long h =b/3600;
        long m =(b%3600)/60;
        long s =b%60;
        System.out.printf("%02d:%02d:%02d\n",h,m,s);
        scan.close();
    }
}
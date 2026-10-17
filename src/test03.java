import java.util.Scanner;
// 1: 无需 package
// 2: 类名必须 Main, 不可修改

public class test03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a= scan.nextInt();
        int b= scan.nextInt();
        int c= scan.nextInt();
        b+=c;
        if(b>60){
            a+=b/60;
            b%=60;
        }
        System.out.println(a);
        System.out.println(b);
        scan.close();
    }
}
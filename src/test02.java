import java.util.Scanner;
// 1: 无需 package
// 2: 类名必须 Main, 不可修改

public class test02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double v= scan.nextDouble();
        double a = Math.cbrt(v);
        double r = 2*Math.cbrt(3 * v / (4 * Math.PI));
        System.out.printf("%.3f" + " " +"%.3f",a,r);
        scan.close();
    }
}
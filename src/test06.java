import java.util.Scanner;

public class test06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int D= scan.nextInt();
        int V= scan.nextInt();
        double d = Math.cbrt(D * D * D - 6.0 * V / Math.PI);
        System.out.printf("%.3f",d);
        scan.close();
    }
}

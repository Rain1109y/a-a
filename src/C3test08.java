import java.util.Scanner;

public class C3test08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        for (int j = 1; j <=i; j++) {
            System.out.println(Math.max(i - j, j - 1) * 2);
        }
    }
}

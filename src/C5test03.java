import java.util.Scanner;

public class C5test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 489) {
            output(to2(n));
            System.out.println();
        } else if (n <= 511) {
            // 方案1：不用10号箱
            output(to2(n));
            System.out.println();

            // 方案2：用10号箱
            printWith10(n - 489);
            System.out.println();
        } else {
            // n > 511，必须用10号箱
            printWith10(n - 489);
            System.out.println();
        }

        sc.close();
    }

    static void printWith10(int t) {
        System.out.print(10);
        if (t > 0) {
            System.out.print("+");
            output(to2(t));
        }
    }

    static int[] to2(int a) {
        int[] arr = new int[11];
        int i = 0;
        while (a > 0) {
            arr[i] = a % 2;
            a = a / 2;
            i++;
        }
        return arr;
    }

    static void output(int[] arr) {
        boolean ok = false;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 1) {
                if (!ok) {
                    System.out.print(i + 1);
                    ok = true;
                } else {
                    System.out.print("+" + (i + 1));
                }
            }
        }
    }
}
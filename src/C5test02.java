import java.util.Scanner;

public class C5test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] pa = new int[20];
        int[] pb = new int[20];
        for (int i = 0; i < 20; i++) pa[i] = scanner.nextInt();
        for (int i = 0; i < 20; i++) pb[i] = scanner.nextInt();

        int ta = 0, tb = 0;

        // 第一阶段:5 轮,每轮 A 先踢、B 后踢
        for (int r = 1; r <= 5; r++) {
            ta += pa[r - 1];                       // ① A 踢
            if (ta + (5 - r) < tb) {               // A 剩下的脚全进也追不上 B
                System.out.println(r);
                System.out.println(ta + ":" + tb);
                return;
            }
            if (tb + (6 - r) < ta) {               // B 剩下的脚全进也追不上 A
                System.out.println(r);
                System.out.println(ta + ":" + tb);
                return;
            }
            tb += pb[r - 1];                       // ② B 踢
            if (ta + (5 - r) < tb) {               // A 追不上 B
                System.out.println(r);
                System.out.println(ta + ":" + tb);
                return;
            }
            if (tb + (5 - r) < ta) {               // B 追不上 A
                System.out.println(r);
                System.out.println(ta + ":" + tb);
                return;
            }
        }

        // 突然死亡:第 6 轮起
        for (int r = 6; r <= 20; r++) {
            ta += pa[r - 1];
            tb += pb[r - 1];
            if (pa[r - 1] != pb[r - 1]) {          // 本轮一进一失,分胜负
                System.out.println(r);
                System.out.println(ta + ":" + tb);
                return;
            }
        }
        scanner.close();
    }
}



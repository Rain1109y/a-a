import java.util.Scanner;

public class C3test04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a =scanner.nextInt();
        double jnum=0,ynum=0;
        for (int i = 0; i < a; i++) {
            int b =scanner.nextInt();
            if(b>=85) ynum++;
            if (b>=60) jnum++;
        }
        double j =jnum/a;
        double y =ynum/a;
        System.out.printf("%.0f%%\n",j*100);
        System.out.printf("%.0f%%\n",y*100);

    }}

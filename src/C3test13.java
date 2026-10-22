import java.util.Scanner;

public class C3test13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x =scanner.nextInt();
        int y =scanner.nextInt();
        int count = 0;
        for (int i = 0; ; i++) {
            long num = Long.parseLong(""+i+i);
            if(num>y)   break;
            if (num>x)   count++;
        }
        System.out.println(count);
    }
}

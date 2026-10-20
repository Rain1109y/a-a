import java.util.Scanner;

public class C3test05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine().substring(1));
        int w=1189, l=841;
        for (int i = 0; i < a; i++) {
            int max = Math.max(l,w);
            int min =Math.min(l,w);
            w=max/2;
            l=min;
        }
        System.out.println(Math.max(l,w) + "\n" + Math.min(l,w));
    }

}

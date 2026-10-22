import java.util.Scanner;

public class C3test12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a =scanner.nextLong();
        for (int k = 1; ; k++) {
            boolean ok =true;
            long n=a;
            for (int i = 0; i < 6; i++) {
                n/=k;
                if (n==0){
                    ok=false;
                    break;
                }
            }
            if (!ok){
                System.out.println(k - 1);
                break;
            }
        }

    }

}

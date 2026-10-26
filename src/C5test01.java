import java.util.Scanner;

public class C5test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long ans = 0, count = 0;
        int i = 1;
        while (n-- > 0){
            ans += i;
            i++;
            count++;
            if (count%3== 0) {
                i-=2;
            }

        }
        System.out.println(ans);

    }
    }

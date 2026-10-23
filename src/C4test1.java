import java.util.Scanner;

public class C4test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        long ans=0;
        for (int j = 1; j <= i ; j++) {
            if (isnum(j)){
                ans+=j;
            }

        }
        System.out.println(ans);

    }
    static boolean isnum(int a){
        while (a>0){
            int d =a%10;
            a/=10;
            if (d==0||d==2||d==1||d==9){
                return true;
            }
        }
        return false;

    }

}

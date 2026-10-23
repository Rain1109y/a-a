import java.util.Scanner;

public class C3test14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        long tot;
        for (long k = 1;  ; k++) {
            tot=n*k+1;
            int i;
            for ( i = n-1; i>=1 ; i--) {
                if (tot%(n-1)!=0){
                    break;
                }
                tot=tot/(n-1)*n+1;
            }
            if (i<1) break;
        }
        System.out.println(tot);
    }
}




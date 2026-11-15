import java.util.Scanner;

public class moni4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] cost = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            cost[i] = scan.nextInt();
        }
        boolean falg=false;
        for (int i = 0; i < n; i++) {
            int gas = 0;
            int c = n;
            int cur=i;
            while (c-- > 0) {
                if (cost[i]> a[i]) {
                    break;
                }
                if (cur>a.length-1)cur=0;
                gas+=a[cur];
                gas-=cost[cur];
               cur++;
               if (gas<0)break;
               if (c==0){falg=true;}
            }
            if (falg) {
                System.out.println(i);
                break;
            }
        }
        if (!falg) System.out.println(-1);
    }
}
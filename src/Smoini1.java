import java.util.Scanner;

public class Smoini1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m =scan.nextInt();
        int n =scan.nextInt();
        int[][] a=new int[m][n];
        int[][] dp=new int[m][n];

        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j]=scan.nextInt();
                dp[0][0]=a[0][0];
                if (i==0&&j>0){
                    dp[0][j]=dp[0][j-1]+a[i][j];
                }
                if (j==0&&i>0){
                    dp[i][0]=dp[i-1][0]+a[i][j];
                }
                if (i>0&&j>0)dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+a[i][j];
            }
        }
        System.out.println(dp[m - 1][n - 1]);
    }
}
//        for (int i = 0; i <m ; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(dp[i][j]+" ");
//            }
//            System.out.println();
//        }

import java.util.Scanner;

public class C5test09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int  m= scan.nextInt();
        int k = scan.nextInt();
        long ans=0;
        int[][]  a=new int[501][501];
        int[][]  s=new int[501][501];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                a[i][j]=scan.nextInt();
                s[i][j]=s[i-1][j]+a[i][j];
            }
        }
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <=n ; j++) {
                for (int l=1,r=1,sm=0;r<=m;r++){
                    sm+=s[j][r]-s[i-1][r];
                    while (sm>k){
                        sm-=s[j][l]-s[i-1][l];
                        l++;
                    }
                    ans+=r-l+1;
                }
            }
        }
        System.out.println(ans);
    }
}

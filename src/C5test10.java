import java.util.Scanner;

public class C5test10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        int size=1<<n;
        int[][]  m=new int[size][size];
        int cur=1;
        m[0][0]=0;
        for (int s = 0; s < n; s++) {
            for (int i=0;i<cur;i++){
                for (int j=0;j<cur;j++){
                     int v=m[i][j];
                     m[2*i][2*j]=v;
                     m[2*i+1][2*j]=v;
                     m[2*i][2*j+1]=v;
                     m[2*i+1][2*j+1]=1-v;
                }
            }
            cur*=2;
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <size-1 ; j++) {
                System.out.print(m[i][j]+" ");
            }
            System.out.println(m[i][size - 1]);
        }

    }
}

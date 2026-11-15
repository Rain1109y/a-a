import java.util.Scanner;

public class moni2 {
    static int shuwei(int a){
        int ans=0;
        while (a>0){
            ans+=(a%10);
            a/=10;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();

        int[] a=new int[91];
        for (int i = 1; i <= n; i++) {
             a[shuwei(i)]++;
        }
        int max=a[0];
        int count=0;
        for (int i = 1; i < 91; i++) {
            if (a[i]>max){
                max=a[i];
            }
        }
        for (int i = 0; i < 91; i++) {
            if (a[i]==max)count++;
        }
        System.out.println(count);

    }

}

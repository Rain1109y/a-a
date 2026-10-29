import java.util.Scanner;

public class C5test04 {
    public static void main(String[] args) {
        int[] ba={1,2,5,10,20,50,100,200,500,1000,2000,5000,10000};
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int cou=0;
        for (int i = 12; i>=0; i--) {
            cou+=a/ba[i];
            a%=ba[i];
        }
        System.out.println(cou);
    }
}


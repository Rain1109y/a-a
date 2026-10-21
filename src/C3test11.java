import java.util.Scanner;

public class C3test11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a =scanner.nextInt();
        int f1=1,f2=2,f3=4,f4=0;
        if(a==1) System.out.println(1);
        if(a==2) System.out.println(2);
        if(a==3) System.out.println(4);
        for (int i = 4; i <=a ; i++) {
            f4=f1+f2+f3;
            f1=f2;
            f2=f3;
            f3=f4;
        }
        System.out.println(f4);

    }

    }




import java.util.Scanner;

public class C3test15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n-->0){
            int a =scanner.nextInt();
            int pos=0;
            boolean ok =true;
           while (a>0){
               if (a%2==1){
                   if (ok) ok=false;
                   else System.out.print(" ");
                   System.out.print(pos);
               }
               a/=2;pos++;
           }
            System.out.println();
        }
    }
}

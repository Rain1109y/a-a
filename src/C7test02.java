import java.util.Scanner;

public class C7test02 {
    static boolean check(int a){
        return a%400==0||(a%4==0&&a%100!=0);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a=scan.nextLine();
        int[]  arr ={-1,31,28,31,30,31,30,31,31,30,31,30,31};
        boolean flag;
        boolean f1=false;
        boolean f2=false;
        for (int i = 1; ; i++) {
            int a1 = Integer.parseInt(a.substring(0, 4));
             String a2= Integer.toString((a1+=i ) );
            flag= a2.charAt(0)==a2.charAt(2)&&a2.charAt(1)==a2.charAt(3) ;
           a2+= new StringBuilder(a2).reverse().toString();
         int m=Integer.parseInt(a2.substring(4,6));
         int y=Integer.parseInt(a2.substring(0,4));
         int d=Integer.parseInt(a2.substring(6,8));
         if (m<1||m>12) continue;
         arr[2]=check(y)?29:28;
         if (d<1||d>arr[m]) continue;
         if (!f1){
             f1=true;
             System.out.println(a2);}

         if (!f2&&flag) {
                f2=true;
                System.out.println(a2);
         }
         if (f2&&f1)break;
        }
     }
}

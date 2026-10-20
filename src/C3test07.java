import java.util.Scanner;

public class C3test07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long sun = 5*a+2*b;
        long day=c/sun*7;
        long s=c%sun;
        for (int i = 1;i<=7&&s>0 ;i++){
            if (i%7==6||i%7==0){
                s-=b;
            } else {s-=a;}day++;}
             System.out.println(day);}}



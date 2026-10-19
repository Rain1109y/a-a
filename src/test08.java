import java.util.Scanner;

public class test08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a =scan.nextLong();
        long b =scan.nextLong();
        long c =scan.nextLong();
        long max = Math.max(a,Math.max(b,c));
        long s1,s2;
        if(max==a){s1=b;s2=c;
        }
        else if(max==b){
            s1=a;s2=c;
        }
        else {s1=a;s2=b;}
        if (max*max==s1*s1+s2*s2){
            System.out.println("yes");
        }
        else System.out.println("no");
        scan.close();
    }
}

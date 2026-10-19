import java.util.Scanner;

public class test05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        int count=0;
        while (a>0){
            a-=sum(a);
            count++;
        }
        System.out.println(count);
    }
        static   public long sum(long a){
               long sum=0;
               while (a>0){
               sum+=a%10;
               a/=10;
               }
               return sum;

        }
}




import java.util.Scanner;
public class test01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int v= scan.nextInt();

        while(v-->0){
            int a= scan.nextInt();
            System.out.println((int) Math.sqrt(a));
        }
        scan.close();
    }
}

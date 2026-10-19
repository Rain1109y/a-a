import java.util.Scanner;

public class test07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a==2){
            System.out.println(28);
        }
        else if(a==4||a==6||a==9||a==11){
            System.out.println(30);
        }
        else System.out.println(31);


        scan.close();
    }
}

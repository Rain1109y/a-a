import java.util.Scanner;

public class C3test09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int len =a.length();
        if (len%2==1){
            System.out.println("no");
        }
        String l = a.substring(0,len/2);
        String r = a.substring(len/2);
        System.out.println(l.equals(r) ? "yes" : "no");
    }
}

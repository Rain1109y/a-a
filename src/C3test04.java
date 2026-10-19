import java.util.Scanner;

public class C3test04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a =scanner.nextInt();
        int ans =0;
        while (a>0){
        ans+=a%10;
        a/=10;
    }
        System.out.println(ans);
    }}

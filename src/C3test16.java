import java.util.Scanner;

public class C3test16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLong()){
            long l = scanner.nextLong();
            long s = l-2009;
            long g =(s+5)%10;
            long z =(s+1)%12;
            System.out.println(g +""+ (char)('A' + z));
        }
    }
}

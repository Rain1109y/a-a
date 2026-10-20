import java.util.Scanner;

public class C3test06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long l = scanner.nextLong();
        long m=0;
        int count=0;
        while (m<l){
            count++;
            m=m*3+1;
        }
        System.out.println(count);
    }
}

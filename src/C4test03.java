import java.util.Scanner;

public class C4test03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int a =scanner.nextInt();
            if (a==0) break;
            for (int i=2;i<=a/2;i++){
                if (issu(i)&&issu(a-i)){
                    System.out.println(a + "=" + i +"+"+ (a - i));
                }
            }
        }
    }
    static boolean issu(int a){
        if (a==1)return false;
        for (int i = 2; i <=a/2; i++) {
            if (a%i==0) return false;
        }
        return true;
    }
}

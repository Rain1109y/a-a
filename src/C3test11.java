import java.util.Scanner;

public class C3test11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a =scanner.nextInt();
        System.out.println(T(a));
    }
    static int T(int a){
        if(a==1)return 1;
        if(a==2)return 2;
        if(a==3)return 4;
        return T(a-1)+T(a-2)+T(a-3);
    }
}



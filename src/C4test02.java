import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class C4test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean[]  lucky = new boolean[5001];
        for (int y=2009 ;y<5001;y++){
            lucky[y]= LocalDate.of(y,11,11).getDayOfWeek()== DayOfWeek.MONDAY;
        }

        int[]  pre =new int[5002];
        for (int y=2009;y<5001;y++){
            pre[y+1]=pre[y]+(lucky[y]?1:0);
        }
        while (true){
            int a =scanner.nextInt();
            int b =scanner.nextInt();
            if (a==0&&b==0)break;
            System.out.println(pre[b] - pre[a]);
        }
    }
}

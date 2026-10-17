import java.util.Scanner;
import java.time.LocalDate;
//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    static int  ff(int a){
        int[] k={13,1,2,3,5,4,4,2,2,2};
    int sum=0;
    while(a>0){
        sum+=k[a%10];
        a=a/10;
    }
    return sum;
}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count=0;
        LocalDate sta = LocalDate.of(2000,1,1);
        LocalDate end = LocalDate.of(2024,4,13);
        for (LocalDate d=sta; !d.isAfter(end) ; d=d.plusDays(1)) {
            int num = d.getYear() * 10000 + d.getMonthValue() * 100 + d.getDayOfMonth();
            if(ff(num)>50){ count++;
        }

    }
        System.out.println(count);
        scan.close();

}}

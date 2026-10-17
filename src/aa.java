import java.util.Scanner;
import java.time.LocalDate;
public class aa {
    long a = 1;        // 初值 a₀
    long fac = 1;       // 当前的 k!
    for(int k = 1; k <=100; k++) {
        fac *= k;       // fac = k!
        a += fac;       // a_k = a_{k-1} + k!
    }
   System.out.printf();
}

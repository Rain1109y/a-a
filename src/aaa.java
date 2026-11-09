import java.util.ArrayList;
import java.util.Scanner;

public class aaa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String tar= scan.nextLine();
        String sub =scan.nextLine();
        ArrayList<Integer>  arr  =new ArrayList<Integer>();
        int pos=0,count=0;
        while (true){
            pos=tar.indexOf(sub,pos);
            if (pos==-1) break;
            count++;
            arr.add(pos);
            pos+=1;
        }
        System.out.println(count);
        boolean falg=true;
        for (int i:arr){
            if (!falg) System.out.print(" ");
            else falg=false;
            System.out.print(i);
        }

    }
}

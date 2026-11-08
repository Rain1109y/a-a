import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class C5test08 {
    static int[] parent;
    static int find(int x){
        if (parent[x]!=x){
            parent[x]=find(parent[x]);
        }
        return parent[x];
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int q = scan.nextInt();
        parent=new int[n+1];
        for (int i = 0; i <q; i++) {
              parent[i]=i;
        }
        while (q-- > 0) {
            int a = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (a == 1) {
               parent[find(x)]=find(y);
            }
            else {
                System.out.println(find(x) == find(y)?"YES":"NO");
            }
        }
    }
}


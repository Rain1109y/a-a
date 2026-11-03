import java.util.Scanner;

public class C5test06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][]   arr=new int[5][5];
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                arr[i][j]=scanner.nextInt();
            }
        }
        boolean flag=false;
        for (int i = 1; i <5 ; i++) {
            int max = arr[i][1];
            for (int j = 1; j < 5; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            arr[i][0] = max;
        }
        for (int j = 1; j <5 ; j++) {
            int min=arr[1][j];
            for (int i = 1; i <5 ; i++) {
                if (arr[i][j]<min){
                    min=arr[i][j];
                }
            }
            arr[0][j]=min;
        }
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                if (arr[i][j] == arr[i][0] && arr[i][j] == arr[0][j]){
                    System.out.println(arr[i][0] + " "+i +" "+ j);
                    flag=true;
                }
            }
        }
        if (!flag) System.out.println("no saddle");

    }

}

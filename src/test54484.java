public class test54484 {
    public static void main(String[] args) {
        long total = 20230610;
        long h = 1;
        long need = 1;
        while (need <= total) {
            h++;
            need = h * (h + 1) * (h + 2) / 6;
        }
        System.out.println(h - 1);
    }
    }


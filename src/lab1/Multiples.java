package lab1;

public class Multiples {
    static void main() {
        int numer = multiples(6789,7,4);
        System.out.println(numer);
    }

    public static int multiples(int n, int a, int b) {
        int dingus = 0;
        for (int i = 1; i < n; i++) {
            if (i % a == 0 || i % b == 0) {
                dingus++;
            }
        }
        return dingus;
    }
    public static int multiples() {
        return multiples(1000,5,3);
    }
}

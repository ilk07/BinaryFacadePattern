package hw;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();

        //62 + 18 = 80 или Binary: 111110 + 10010 = 1010000
        System.out.println(bins.sum("111110", "10010"));
        // 2 * 10 = 20 или Binary: 10 * 1010 = 10100
        System.out.println(bins.mult("10", "1010"));

    }
}
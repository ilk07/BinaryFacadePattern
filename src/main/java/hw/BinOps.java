package hw;

public class BinOps {
    public String sum(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/

        int arg1 = Integer.parseInt(a, 2);
        int arg2 = Integer.parseInt(b, 2);
        int sum = arg1 + arg2;
        String res = Integer.toBinaryString(sum);
        return res;

    }

    public String mult(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/
        int arg1 = Integer.parseInt(a, 2);
        int arg2 = Integer.parseInt(b, 2);
        int mult = arg1 * arg2;
        String res = Integer.toBinaryString(mult);
        return res;
    }



}

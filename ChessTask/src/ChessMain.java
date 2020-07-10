import java.io.*;
import java.math.BigInteger;

public class ChessMain {
    private static String  s="";
    private static String  s1="";
    private static int d;
    private static int d1;
    public static BigInteger getFactorial(int f) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= f; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
    int x;
    int y;
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader buffer = new BufferedReader(reader);
        while (d * d1 < 8) {
            System.out.println("Введите размеры доски");
            System.out.print("x: ");
            s = buffer.readLine();
            d = Integer.parseInt(s);
            System.out.print("y: ");
            s1 = buffer.readLine();
            d1 = Integer.parseInt(s1);
        }
       // System.out.println(calculateFactorial(48));
        BigInteger one = getFactorial(d * d1); // x * y
        BigInteger two = getFactorial(d * d1 - 8); // x * y - 8
        BigInteger three = getFactorial(8);
        BigInteger b = one.divide(two.multiply(three));
        System.out.println("Кол-во вариантов размещения:" + b);
      //  long c3 = getFactorial(48)/(getFactorial(40)  getFactorial(8));
        //System.out.println(c3);
    }
}

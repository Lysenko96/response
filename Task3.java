import java.math.BigInteger;

public class Task3 {
    static BigInteger d = BigInteger.ONE;
    static BigInteger sum = BigInteger.ONE;

    public static void main(String[] args) {
        for(int i = 0; i < 60; i++){
            d = d.multiply(BigInteger.TWO);
        }
        System.out.println(d);
       // sum = d;
        BigInteger d = BigInteger.TEN.subtract(BigInteger.TWO);
       // while (d.compareTo( sum)) {
            for (int i = 0; i < 57; i++) {
                d = d.multiply(BigInteger.TWO);
            }
        //}
        System.out.println(d);
    }
}

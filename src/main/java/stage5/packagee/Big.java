package stage5.packagee;

import java.math.BigInteger;

public class Big {
    public static Number getBigInteger(String number) {
        java.math.BigInteger biginteger = new java.math.BigInteger(number);
        return biginteger;
    }
}

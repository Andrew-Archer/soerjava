package codemude.datatypes.simple;

import static java.lang.System.*;

public class PrimitiveDataTypes {
    public static void main(String... args) {
        //Integer types
        byte asciiCharCode = 1;
        short halfOfInteger = 2;
        int applesICanEat = 3;
        long hereWeCanStoreRealBigNumber = 4L;

        //Fractional numbers
        float someNotPreciseNumber = 0.1f;
        double someBiggerNotPreciseNumber = 0.2;

        out.println("Next goes primitive integer types");
        out.printf("asciiCharCode has type [%s] with size [%s bits] and value [%d] it's value range [%,d .. %,d]  %n",
                "byte", Byte.BYTES * 8, asciiCharCode, Byte.MIN_VALUE, Byte.MAX_VALUE);
        out.printf("halfOfInteger has type [%s] with size [%s bits] and value [%d] it's value range [%,d .. %,d] %n",
                "short", Short.BYTES * 8, halfOfInteger, Short.MIN_VALUE, Short.MAX_VALUE);
        out.printf("applesICanEat has type [%s] with size [%s bits] and value [%d] it's value range [%,d .. %,d] %n",
                "int", Integer.BYTES * 8, applesICanEat, Integer.MIN_VALUE, Integer.MAX_VALUE);
        out.printf("applesICanEat has type [%s] with size [%s bits] and value [%d] it's value range [%,d .. %,d] %n",
                "long", Long.BYTES * 8, hereWeCanStoreRealBigNumber, Long.MIN_VALUE, Long.MAX_VALUE);
        out.println();

        out.println("Next goes primitive fractional number types");
        out.printf("someNotPreciseNumber has type [%s] with size [%s bits] and value [%f] it's value range [%f .. %f] %n",
                "float", Float.BYTES * 8, someNotPreciseNumber, Float.MIN_VALUE, Float.MAX_VALUE);
        out.printf("applesICanEat has type [%s] with size [%s bits] and value [%f] it's value range [%f .. %f] %n",
                "double", Double.BYTES * 8, someBiggerNotPreciseNumber, Double.MIN_VALUE, Double.MAX_VALUE);

    }
}

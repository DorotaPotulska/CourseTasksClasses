package JavaGda34.weekend1.typyZmiennych;

public class KonwersjaTypowCz5 {

    public static void main(String[] args) {
        //A. short - > int
        short zmiennaShort = 32767;
        int zmiennaInt = zmiennaShort;
        System.out.println(zmiennaInt);
        // B. short -> long
        short zmiennaShort2 = 32767;
        long zmiennaLong = zmiennaShort2;
        System.out.println(zmiennaLong);
        // C. int -> float
        int zmiennaInt2 = 2147483647;
        float zmiennaFloat = zmiennaInt2;
        System.out.println(zmiennaFloat);
        // D. int -> double
        int zmiennaInt3 = 2147483647;
        double zmiennaDouble = zmiennaInt3;
        System.out.println(zmiennaDouble);
        // E. long -> int
        long zmiennaLong2 = 888786536754l;
        int zmiennaInt4 = (int) zmiennaLong2;
        System.out.println(zmiennaInt4);
        // F. short -> byte
        short zmiennaShort3 = 32767;
        byte zmiennaByte = (byte) zmiennaShort3;
        System.out.println(zmiennaByte);
        // G. char -> int
        char zmiennaChar = '2';
        int zmiennaInt5 = zmiennaChar;
        System.out.println(zmiennaInt5);
    }
}

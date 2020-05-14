package JavaGda34.weekend1.typyZmiennych;

public class TypyCz2 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(false == false);//true
        System.out.println(false != true);//true
        System.out.println(!true);//false
        System.out.println(2 > 4);//false
        System.out.println(3 > 5);//false
        System.out.println(3 == 3 && 3 == 4); //false
        System.out.println(3 != 5 || 3 == 5);//true
        System.out.println((2 + 4) > (1 + 3));//true
        System.out.println("cos".equals("cos"));//true to jest poprawne porównanie stringów!!!
        //System.out.println("cos" == "cos");//true , ale stringów nie nalezy tak porównywać!!

        //cos tu nie zadziałało
        // String cos = new String(orginal:"cos");
        //String cos2 = new String(orginal:"cos");
        //System.out.println(cos == cos2);//false
        short tysiac = 1000;
        byte tysiacByte = (byte) tysiac;//przypisanie zmiennej wiekszego typu do mniejszego typu od -128 do 127,, zaczyna od 0 bo wychodzi -24
        System.out.println(tysiacByte);

        byte sto = 100;
        byte dwa = 2;
        short stoDwa = (short) (sto + dwa);

        //(short)cos na szaro oznacza ze jest nam niepotrzebne
        short wynik = (short) (sto);
    }
}

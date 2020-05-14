package JavaGda34.weekend1.typyZmiennych;

public class OkreslenieTypowCz3 {

    public static void main(String[] args) {
        //int
        System.out.println(2 + 3);
        System.out.println(2 - 4);
        System.out.println(5 / 2);

        //double
        System.out.println(5.0 / 2);
        System.out.println(5 / 2.0);
        System.out.println(5.0 / 2.0);
        //long
        System.out.println(100L - 10);
        //float
        System.out.println(2f - 3);
        System.out.println(5f / 2);
        //double
        System.out.println(5d / 2);

        //kod ASCII
        //int
        System.out.println('A' + 2);

        System.out.println('a' + 2);
        //String
        System.out.println("a" + 2);
        System.out.println("a" + "b");
        //ASCII
        //int
        System.out.println('a' + 'b');
        //string bo zaczyna się ""
        System.out.println("a" + 'b'); //ab
        System.out.println("a" + 'b' + 3);//ab3
        System.out.println('b' + 3 + "a");//101a , gdzie 'b' zamienia nna asci dodaje 3 i dokleja a
        System.out.println(9 % 4);// reszta z dzielenia 1

        System.out.println('b' + "a");//ba


        int samodzielnieLiczonaReszta = 9 - (9 / 4) * 4;

        boolean prawda = true;
        boolean falsz = false;

        int zmienna = 50;
        System.out.println(zmienna);//50
        zmienna = zmienna + 1;
        //postinkrementacja
        zmienna++;
        System.out.println(zmienna);//52
        //preinkrementacja
        ++zmienna;
        System.out.println(zmienna);//53

        System.out.println(zmienna++);

        System.out.println(zmienna++);

        zmienna += 5;
        zmienna -= 5;
        zmienna /= 5;

        //== porównanie, = przypisuje


    }

}
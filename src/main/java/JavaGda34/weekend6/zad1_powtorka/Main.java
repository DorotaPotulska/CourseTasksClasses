package JavaGda34.weekend6.zad1_powtorka;

public class Main {

    public static void main(String[] args) {
/////////////cz1
        //zadania z gita
        //https://github.com/chodek/programowanie_I_zadania

///////////////cz2
       /* Map<String,Integer> mapaStringowNaInty=new HashMap<>();

        mapaStringowNaInty.put("Ala",1);
        mapaStringowNaInty.put("Ala",2);
        mapaStringowNaInty.put("Ala",3);
        mapaStringowNaInty.put("Alan",1);

        System.out.println(mapaStringowNaInty);*/
//////////////cz3
        //mapaStringowNaInty.values();// pobranie wartosci
        //mapaStringowNaInty.keySet(); //pobranie kluczy

        //mapaStringowNaInty.entrySet();//metoda entrySet zwraca pary klucz - wartosc
//////////////cz4
/*        Student janek = new Student("Jan","Kowalski",1234);
        Student andrzej= new Student("Andrzej","Kowalski",1234);
        Map<String, Student> mapaStudentow=new HashMap<>();

        mapaStudentow.put(janek.getNazawisko(),janek);
        mapaStudentow.put(andrzej.getNazawisko(),andrzej);
        mapaStudentow.put(andrzej.getNazawisko(),andrzej);*/

//////////////cz5

        Student janek = new Student("Jan","Kowalski",1234);
        Student andrzej= new Student("Andrzej","Kowalski",1234);

        System.out.println(janek.wiek);
        System.out.println(andrzej.wiek);

        janek.wiek+=30;

        System.out.println(janek.wiek);
        System.out.println(andrzej.wiek);
    }
}

package JavaGda34.weekend4.typy_generyczne.zad1_dokończ_pkt6;
      /*  1. Utwórz klasę generyczną Garaż, która umożliwia przechowywanie 2 Samochodów
        2. Utwórz klasę Samochod z polami:
            1. Marka
            2. Model
            3. Kolor
                3. Oraz metodami:
            1. toString() – zwracające opis auta
            2. zmieńKolor(String kolor)
        4. Utwórz klasy BMW i Porshe dziedziczące po Samochodzie z mniejszą liczbą argumentów
        5. Dodaj metody do klasy Garaż: 1. zaparkuj(auto) :void 2. wyprowadz(auto):auto
        6. * Utwórz własny wyjątek na sytuację gdy oba miejsca są już zajęte i nie można zaparkować kolejnego auta*/
public class Main {
          public static void main(String[] args) {
              Samochod porshe= new Porshe("911","czarny");
              Samochod bmw=new BMW("320","czerwony");

              Garaz<Samochod> garaz= new Garaz<Samochod>(porshe,bmw);
              System.out.println(garaz);
              garaz.zaparkuj(porshe);
              garaz.zaparkuj(bmw);
              garaz.zaparkuj(porshe);
              garaz.zaparkuj(bmw);
              garaz.wyprowadz(porshe);
              System.out.println(garaz);
              garaz.zaparkuj(bmw);
              System.out.println(garaz);
              garaz.wyprowadz(porshe);
              System.out.println(garaz);
              garaz.wyprowadz(bmw);
              System.out.println(garaz);
              garaz.wyprowadz(bmw);
              System.out.println(garaz);
              garaz.zaparkuj(porshe);
              garaz.zaparkuj(bmw);
              System.out.println(garaz);





          }
}

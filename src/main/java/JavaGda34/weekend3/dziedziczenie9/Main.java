package JavaGda34.weekend3.dziedziczenie9;
//wywołujemy kukułke a w dziedziczeniu widzimy ze Java idzie z kodem od rodzica zwierze-ptak i dopiero kukulka
public class Main {
    public static void main(String[] args) {

        Kukulka kukulka = new Kukulka();
        Ptak ptak =new Ptak();
        System.out.println(ptak); // tu bedzie adres
        System.out.println(kukulka.toString());// tu nadpisujemy to Stringa i zwraca co my chcemy

        kukulka.equals("akakakak");
    }

}

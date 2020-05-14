package JavaGda34.weekend5.zad1_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/*          1. Utwórz klasę MapaTest a w niej metodę psvm
            2. Utwórz hashmapę gdzie kluczem będzie String – imię
            a wartościa int – wiek
            3. Dodaj do mapy kilka wystąpień
            4. Wyświetl mapę (sout)
            5. Spróbuj dodać do mapy obecny już klucz z inna
            wartością – co się stanie?
            6. Przeiteruj mapę za pomocą pętli for (.keySet())
            7. Sprawdź zachowanie dla innych implementacji mapy:
                1. LinkedHashMap
                2. TreeMap*/
public class MapaTest {
    public static void main(String[] args) {
        HashMap<String, Integer> mapaHashMap =new HashMap<>();

        mapaHashMap.put("Dorota",18);
        mapaHashMap.put("Piotr",30);
        mapaHashMap.put("Maks",4);
        mapaHashMap.put("Anastazja",2);

        System.out.println("Rozmiar mapy "+mapaHashMap.size());
        //Wyświetlam zawartość mapy
        System.out.println(mapaHashMap);
        System.out.println("Dodaje element o tym samym kluczu");
        mapaHashMap.put("Maks",8);
        System.out.println("Element został dodany? czy nadpisany?");
        System.out.println(mapaHashMap); //element noe został dodany ale nadpisany
        System.out.println("NADPISANY");

        for(String key:mapaHashMap.keySet()){
            System.out.println("Key = "+key);
        }

        for(String key:mapaHashMap.keySet()){
            Integer value = mapaHashMap.get(key);
            System.out.println("Key = "+key + ", Value = "+value);
        }

        System.out.println("SPRAWDZENIE DLA LinkedHashMap");
        LinkedHashMap<String, Integer> mapaLinkedHashMap =new LinkedHashMap<>();

        mapaLinkedHashMap.put("Dorota",18);
        mapaLinkedHashMap.put("Piotr",30);
        mapaLinkedHashMap.put("Maks",4);
        mapaLinkedHashMap.put("Anastazja",2);

        System.out.println("Rozmiar mapy"+mapaLinkedHashMap.size());
        //Wyświetlam zawartość mapy
        System.out.println(mapaLinkedHashMap);
        System.out.println("Dodaje element o tym samym kluczu");
        mapaLinkedHashMap.put("Maks",8);
        System.out.println("Element został dodany? czy nadpisany?");
        System.out.println(mapaLinkedHashMap); //element noe został dodany ale nadpisany
        System.out.println("NADPISANY");

        for(String key:mapaLinkedHashMap.keySet()){
            System.out.println("Key = "+key);
        }

        for(String key:mapaLinkedHashMap.keySet()){
            Integer value = mapaLinkedHashMap.get(key);
            System.out.println("Key = "+key + ", Value = "+value);
        }
        System.out.println("SPRAWDZENIE DLA TreeMap");
        TreeMap<String, Integer> mapaTreeMap =new TreeMap<>();

        mapaTreeMap.put("Dorota",18);
        mapaTreeMap.put("Piotr",30);
        mapaTreeMap.put("Maks",4);
        mapaTreeMap.put("Anastazja",2);

        System.out.println("Rozmiar mapy"+mapaTreeMap.size());
        //Wyświetlam zawartość mapy
        System.out.println(mapaTreeMap);
        System.out.println("Dodaje element o tym samym kluczu");
        mapaTreeMap.put("Maks",8);
        System.out.println("Element został dodany? czy nadpisany?");
        System.out.println(mapaTreeMap); //element noe został dodany ale nadpisany
        System.out.println("NADPISANY");

        for(String key:mapaTreeMap.keySet()){
            System.out.println("Key = "+key);
        }

        for(String key:mapaTreeMap.keySet()){
            Integer value = mapaTreeMap.get(key);
            System.out.println("Key = "+key + ", Value = "+value);
        }

    }
}

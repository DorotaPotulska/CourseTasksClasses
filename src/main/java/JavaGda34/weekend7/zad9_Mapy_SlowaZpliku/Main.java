package JavaGda34.weekend7.zad9_Mapy_SlowaZpliku;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

// pobranie tektu i zliczenie ilosci wystapienia danego słowa
public class Main {


    public static void main(String[] args) throws FileNotFoundException {

        List<String> lista = wczytajPlik("C:\\Users\\cdc4\\Desktop\\SDA_JAVA\\tekst.txt");

        HashMap<String, Integer> MapaSlow = zliczSlowa(lista);

        for (String key : MapaSlow.keySet()) {
            Integer value = MapaSlow.get(key);
            System.out.println("Key = " + key + ", Value = " + value);
        }


        System.out.println("Najczęściej wystepujące słowo to: " +najczestszeSlowo(MapaSlow));

    }
    private static String najczestszeSlowo(HashMap<String, Integer> MapaSlow) {

        String slowo = "";
        int ilosc = 0;

        for (String key : MapaSlow.keySet()) {

            if (MapaSlow.get(key) > ilosc) {
                slowo = key;
                ilosc = MapaSlow.get(key);
            }

        }
        return slowo;
    }
    public static List<String> wczytajPlik(String sciezka) throws FileNotFoundException {
      /*  FileReader plik = new FileReader("C:\\Users\\cdc4\\Desktop\\SDA_JAVA\\tekst.txt");
        BufferedReader odczytPliku = new BufferedReader(plik);*/
        List<String> listaSlow = new ArrayList<>();
        File plik = new File(sciezka);
        Scanner odczyt = new Scanner(plik);


        while (odczyt.hasNext()) {
            String linia = odczyt.nextLine();
            System.out.println(linia);
            String[] tabSlow = zastapZnaki(linia).split(" ");
            System.out.println("jestem w while wczytaj plki");

            for (int i = 0; i < tabSlow.length; i++) {
                listaSlow.add(tabSlow[i]);

            }
        }

        for (int i = 0; i < listaSlow.size(); i++) {
            System.out.println(listaSlow.get(i));
        }
        return listaSlow;
    }

    public static String zastapZnaki(String linia) {
        String[] znakiDoZmiany = new String[]{":", ",", "/", ">", "<", "'", ":", ";", "!", "@", "#", "-", "\\.", "\\)", "\\(", "\"", "\''", "`"};
        String nowaLinia = "";
        for (int i = 0; i < znakiDoZmiany.length; i++) {
            if (i == 0) {
                //System.out.println("jestem w zastap znaki i=0");
                nowaLinia = linia.replaceAll(znakiDoZmiany[i], "");
                //System.out.println(linia.replaceAll(znakiDoZmiany[i], ""));
                //System.out.println(nowaLinia);
                //System.out.println("----------");
            } else {
                //System.out.println("jestem w zastap znaki " + i + " znak " + znakiDoZmiany[i]);
                nowaLinia = nowaLinia.replaceAll(znakiDoZmiany[i], "");
                //System.out.println(nowaLinia.replaceAll(znakiDoZmiany[i], ""));
                //System.out.println(nowaLinia);
                //System.out.println("----------");
            }

        }
        System.out.println("wyrzucam");
        System.out.println(nowaLinia.toLowerCase());
        return nowaLinia.toLowerCase();
    }

    public static HashMap<String, Integer> zliczSlowa(List<String> listaSlow) {
        HashMap<String, Integer> mapaSlow = new HashMap<>();

        int ilosc = 0;
        for (int i = 0; i < listaSlow.size(); i++) {
            for (int j = 0; j < listaSlow.size(); j++) {
                if (listaSlow.get(i).equals(listaSlow.get(j))) {
                    ilosc++;
                }
            }
            System.out.println(listaSlow.get(i));
            System.out.println(ilosc);
            if (!mapaSlow.containsKey(listaSlow.get(i))) {
                mapaSlow.put(listaSlow.get(i), ilosc);
            } else if (mapaSlow.isEmpty()) {
                mapaSlow.put(listaSlow.get(i), ilosc);
            }
            ilosc = 0;
        }

        return mapaSlow;
    }
}

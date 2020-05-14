package JavaGda34.weekend1.instrukcjeSterujace;

public class instrukcjaSwitch {
    public static void main(String[] args) {
        int wiek = 17;

        System.out.println(wiek);
        // tylko do porównania przypadków ==
        //tylko dla int i string
        //dla stringa sam wewnetrzenie srawdza equels
        switch(wiek){
            case 1:
                System.out.println("Masz rok");
                break;
            case 2:
                System.out.println("masz 2 lata");
                break;
            default:
                System.out.println("nie wiem ile masz lat");
                break;
        }
    }
}

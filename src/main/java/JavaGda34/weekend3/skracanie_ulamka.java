package JavaGda34.weekend3;

public class skracanie_ulamka {
    public static void main(String[] args) {
        int licznik;
        int mianownik;
licznik =10;
mianownik=30;
        for(int i=licznik;i>0 ;i--){

            if(licznik%i==0 && mianownik%i==0){
                licznik=licznik/i;
                mianownik=mianownik/i;
                i=licznik;

            }
            if(licznik==1 ||mianownik==1){
                break;
            }

        }

        System.out.println(licznik);
        System.out.println(mianownik);
    }
}

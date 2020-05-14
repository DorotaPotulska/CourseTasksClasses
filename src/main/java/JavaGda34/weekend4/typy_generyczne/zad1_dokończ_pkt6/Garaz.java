package JavaGda34.weekend4.typy_generyczne.zad1_dokończ_pkt6;

public class Garaz<T> {

    private T miejsce1;
    private T miejsce2;


    public Garaz(T miejsce1, T miejsce2) {
        this.miejsce1 = miejsce1;
        this.miejsce2 = miejsce2;
    }

    public void setMiejsce1(T miejsce1) {
        this.miejsce1 = miejsce1;
    }

    public void setMiejsce2(T miejsce2) {
        this.miejsce2 = miejsce2;
    }

    public void zaparkuj(T pojazd){
        if(this.miejsce1==null){
         setMiejsce1(pojazd);
            System.out.println(pojazd+" Zaparkowano na miejscu 1");
        }else if(this.miejsce2==null){
            setMiejsce2(pojazd);
            System.out.println(pojazd+" Zaparkowano na miejscu 2");
        }else{
            System.out.println("Miejsca są zajęte");
        }

    }

    public void wyprowadz(T pojazd){
        if(this.miejsce1!=null && this.miejsce1.equals(pojazd)){
            setMiejsce1(null);
            System.out.println(pojazd+" wyjechał z miejsca 1");
        }else if(this.miejsce2!=null && this.miejsce2.equals(pojazd)){
            setMiejsce2(null);
            System.out.println(pojazd+" wyjechał z miejsca 2");
        }else if(this.miejsce1==null && this.miejsce2==null) {
            System.out.println("Parking jest pusty");
        }else {
                System.out.println("Pojazdu nie ma na parkingu");
            }
        }




    @Override
    public String toString() {
        return "Garaz{" +
                "miejsce1=" + miejsce1 +
                ", miejsce2=" + miejsce2 +
                '}';
    }


}

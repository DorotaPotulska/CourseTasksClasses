package JavaGda34.weekend3.samochod10;

public class Samochod {

    protected int predkosc;
    protected boolean swiatla;

    public Samochod(int predkosc, boolean swiatla) {
        this.predkosc = predkosc;
        this.swiatla = swiatla;
    }

    public void przyspiesz(){
        if(this.predkosc<120) {
            this.predkosc = this.predkosc + 10;
            System.out.println("Przyspieszam do "+this.predkosc+" km/h");
        }else {
            System.out.println("Mamy ograniczenie predkosci do 120 km/h");
        }


    }

    public void przelaczSwiatla(){
        this.swiatla=!this.swiatla;
        if(this.swiatla==true){
            System.out.println("Swiatła zostały włączone");
        }else {
            System.out.println("Swiatla zostały wyłaczone");
        }
    }

    public boolean czSwiatlaWlaczone(){
        if(this.swiatla==true){
            System.out.println("Swiatla są włączone");
        }
        return this.swiatla;
    }
}

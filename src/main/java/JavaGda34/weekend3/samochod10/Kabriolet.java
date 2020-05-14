package JavaGda34.weekend3.samochod10;

public class Kabriolet extends Samochod {

    protected boolean schowanyDach;

    public Kabriolet(int predkosc, boolean swiatla, boolean schowanyDach) {
        super(predkosc, swiatla);
        this.schowanyDach = schowanyDach;
    }

    public void schowajDach(){
        if(this.schowanyDach==true){
            System.out.println("Dach jest schowany");
        }else{
            this.schowanyDach=!this.schowanyDach;
            System.out.println("Dach został schowany");
        }
    }

    public boolean czyDachSchowany(){
        if(this.schowanyDach==true){
            System.out.println("Dach jest schowany");
        }
       return this.schowanyDach;
    }

    @Override
    public void przyspiesz(){
        if(this.predkosc<180) {
            this.predkosc = this.predkosc + 10;
            System.out.println("Przyspieszam do "+this.predkosc+" km/h");
        }else {
            System.out.println("Mamy ograniczenie predkosci do 180 km/h");
        }
    }
}

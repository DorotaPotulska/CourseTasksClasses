package JavaGda34.weekend4.interfejsy.zad4_Grzeje_Chlodzi;

public class Farelka implements Grzeje{

    double temp;

    public void setTemp(double temp) {
        this.temp = temp;
    }

    @Override
    public double pobierzTemp() {
        return this.temp;
    }

    @Override
    public void zwiekszTemp(){
        System.out.println( "Zwiększam o 5");
        setTemp(pobierzTemp()+5);
    }
}

package JavaGda34.weekend4.interfejsy.zad4_Grzeje_Chlodzi;

public class Wiatrak implements Chlodzi {

    protected double temp;

    public Wiatrak() {
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    @Override
    public double pobierzTemp() {
        return this.temp;
    }

    @Override
    public void zmniejszTemp(){
        System.out.println("Zmniejszam o 3");
        setTemp(pobierzTemp() - 3);
//        double temp =pobierzTemp();
//        System.out.println("Temperatura została zmniejszona do "+);;
    }
}

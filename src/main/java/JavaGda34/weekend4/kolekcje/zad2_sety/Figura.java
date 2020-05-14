package JavaGda34.weekend4.kolekcje.zad2_sety;

abstract class Figura implements Comparable{

    public abstract double obliczPole();

    @Override
    public String toString() {
        return "Figura{}"+obliczPole();
    }

    @Override
    public int compareTo(Object o) {
        Figura that = (Figura) o;
        if(this.obliczPole()<that.obliczPole()){
            return  -1;
        }else{
            return 1;
        }
    }
}

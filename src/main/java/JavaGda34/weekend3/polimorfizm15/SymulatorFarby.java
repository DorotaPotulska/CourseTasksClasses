package JavaGda34.weekend3.polimorfizm15;

public class SymulatorFarby {
    public static int obliczZapotrzebowanieNaFarbe(Figura[] tablicaFigur, double wielkoscPojemnika){
        double powierzchniaDoPomalowania;
        powierzchniaDoPomalowania=0;

        for(int i=0;i<tablicaFigur.length;i++){

            powierzchniaDoPomalowania+=tablicaFigur[i].obliczPole();
        }

        int iloscPojemnikow= (int)(Math.ceil(powierzchniaDoPomalowania/wielkoscPojemnika));
        return iloscPojemnikow;
    }
}

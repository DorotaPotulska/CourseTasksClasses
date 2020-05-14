package JavaGda34.weekend10_TypyGeneryczne.Singleton.zad1;

public class MultiThreadeSingletonExample {
    //Singleton leasy
    private static MultiThreadeSingletonExample instance;

    private MultiThreadeSingletonExample() {
    }
    //oba watki wywoluja getInstance, dlatego klasyczny singleton leasy nie nadaje sie do wielowatkowości
    //watek a zrobi to if(instance==null){ i watek b zrobi to if(instance==null){ i oba przejda do    instance= new MultiThreadeSingletonExample();
    /*public static MultiThreadeSingletonExample getInstance(){
        if(instance==null){
            instance= new MultiThreadeSingletonExample();
        }
        return instance;
    }*/

    // singleton do wielowątkowosci double check
    public static MultiThreadeSingletonExample getInstance() {
        if (instance == null) { //dodatkowe sprawdzenie by za kazdym razem nie sprawdzac czy ktos wszedło synchronized (MultiThreadeSingletonExample.class)
            //działa jak taoleta jak watek 1 wejdzie to watek 2 nie wejdzie az watek 1 nie wyjdzie a potem instatnce juz nie jest nullem
            synchronized (MultiThreadeSingletonExample.class) {
                if (instance == null) {
                    instance = new MultiThreadeSingletonExample();// instancja musi byc strworzona raz!!!                }
                }
            }

        }
        //Singleton double chceck i typu igger nadaje sie do wielowątkowosci
        return instance;
    }

}
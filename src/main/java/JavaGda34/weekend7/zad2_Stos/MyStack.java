package JavaGda34.weekend7.zad2_Stos;

public class MyStack {

    int[] stos;
    int wierzcholekStosu;

    public MyStack(int[] stos, int wierzcholekStosu) {
        this.stos = stos;
        this.wierzcholekStosu = wierzcholekStosu;
    }

    public void push(int argument){
        if(wierzcholekStosu>=this.stos.length){
            powiekszStos();
        }
        this.stos[wierzcholekStosu]=argument;
        this.wierzcholekStosu++;
    }

    public int pop(){
        int ostatni;
        ostatni = this.stos[wierzcholekStosu-1];
        this.wierzcholekStosu--;
        return ostatni;
    }

    public int peek(){
        return this.stos[this.wierzcholekStosu-1];
    }

    public void isEmpty() {
        if(this.stos.length==0){
            System.out.println("Stos jes pusty");
        }else{
            System.out.println("Stos nie jest pusty");
        }
    }

    private void powiekszStos(){
        int[] nowaTab =new int[this.stos.length*2];


        for (int i = 0; i < nowaTab.length; i++) {
            nowaTab[i]=stos[i];
        }
        this.stos=nowaTab;
    }


}

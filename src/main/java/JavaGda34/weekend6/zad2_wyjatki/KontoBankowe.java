package JavaGda34.weekend6.zad2_wyjatki;

public class KontoBankowe {
    protected long stanKonta;

    public KontoBankowe(long stanKonta) {
        this.stanKonta = stanKonta;
    }

    public long getStanKonta() {
        return stanKonta;
    }

    public long wyplacSrodki(long kwotaDoWyplaty) throws Exception {
        if(kwotaDoWyplaty<stanKonta){
            stanKonta-=kwotaDoWyplaty;
            return kwotaDoWyplaty;
        }else {
            throw new Exception("Nie masz kasy");
        }

    }

    public void test(){
        try{
            System.out.println("jestem w bloku try");
            return;
        }catch (Exception e){
            System.out.println("jestem w bloku catch");
        }finally {
            System.out.println("jestem w bloku finally");

        }
    }
}

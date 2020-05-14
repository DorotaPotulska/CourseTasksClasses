package JavaGda34.weekend3.bank3;

public class KontoBankowe {
    private long numerKonta;
    private long stanKonta; // bigdecimal do przechowywania stanu konta $
    //public BigDecimal stanKonta;

    public KontoBankowe(long numerKonta, long stanKonta) {
        this.numerKonta = numerKonta;
        this.stanKonta = stanKonta;
    }

    public long getNumerKonta() {
        return numerKonta;
    }

    public long getStanKonta() {
        return stanKonta;
    }
    private boolean sprawdzCzyStanKontaPonadDebetem(){ //prywatna metoda bedzie dostepna tylkow tej klasie na jej obiektach
        if(stanKonta>0){
            return true;
        }else{
            return false;
        }
    }

    public void przelewWychodzacy(KontoBankowe kontoOdbiorcy,long kwotaPrzelewu){
        if(sprawdzCzyStanKontaPonadDebetem()==true){
        this.stanKonta-=kwotaPrzelewu;
        kontoOdbiorcy.stanKonta+=kwotaPrzelewu;
        }
    }


}

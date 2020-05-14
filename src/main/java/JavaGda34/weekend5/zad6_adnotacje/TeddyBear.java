package JavaGda34.weekend5.zad6_adnotacje;

public class TeddyBear {
    @MaxLength(maxLength = 5)
    String ksywka;

    @MaxLength
    String producent;

    public TeddyBear(String ksywka, String producent) {
        this.ksywka = ksywka;
        this.producent = producent;
    }

    public String getKsywka() {
        return ksywka;
    }

    public void setKsywka(String ksywka) {
        this.ksywka = ksywka;

        try {
            if (!TeddyBearAgeValidator.validate(this)) {
                throw new IllegalArgumentException("Zła długość Stringa w polu Ksywka");
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
        try {
            if (!TeddyBearAgeValidator.validate(this)) {
                throw new IllegalArgumentException("Zła długość Stringa w polu Producent");
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}

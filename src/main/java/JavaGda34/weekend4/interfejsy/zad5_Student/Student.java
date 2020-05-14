package JavaGda34.weekend4.interfejsy.zad5_Student;

public class Student implements Comparable{

    String imie;
    String nazwisko;
    int nrAlbumu;

    public Student(String imie, String nazwisko, int nrAlbumu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrAlbumu = nrAlbumu;
    }



    @Override
    public int compareTo(Object o) {
        Student that = (Student) o;
         if(this.nrAlbumu<that.nrAlbumu){
             return  -1;
         }else if(this.nrAlbumu>that.nrAlbumu){
             return 1;
         }else{
             if(this.nazwisko.compareTo(that.nazwisko)==0){
                 return this.imie.compareTo(that.imie);
             }else{
                 return this.nazwisko.compareTo(that.nazwisko);
             }
         }

    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", nrAlbumu=" + nrAlbumu +
                '}';
    }
}

package JavaGda34.weekend1.instrukcjeSterujace;

public class instrukcjaIf {
    public static void main(String[] args) {
        if (2 > 3) {
            System.out.println(":)");
        }else{
            System.out.println(":(");
        }

        if (4 < 5) {
            System.out.println(":)");
        }else {
            System.out.println(":(");
        }

        if ((2 - 2) == 0) {
            System.out.println(":)");
        }else {
            System.out.println(":(");
        }

        if (true) {
            System.out.println(":)");
        }else {
            System.out.println(":(");
        }

        if (9 % 2 == 0) {
            System.out.println(":)");
        }else {
            System.out.println(":(");
        }

        if (9 % 3 == 0) {
            System.out.println(":)");
        }else {
            System.out.println(":(");
        }

        int wiek=20;

        if(wiek<18){
            System.out.println("Jesteś niepełnoletni");
        }else if(wiek>=18 && wiek <99){
            System.out.println("Jesteś pełnoletni");
        }else {
            System.out.println("Jesteś stary");
        }
    }
}

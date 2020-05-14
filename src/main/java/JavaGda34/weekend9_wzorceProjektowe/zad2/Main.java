package JavaGda34.weekend9_wzorceProjektowe.zad2;

public class Main {
    public static void main(String[] args) {
       /* Home Jednorodzinny=new Home.HomeBuilder()
                .withArea(68.9)
                .withCountFloor(1)
                .withCountRoom(5)
                .withTypeRoof(TypeRoof.PłASKI)
                .withTypeHeating(TypeHeating.GAZOWE)
                .withIsGarage(true)
                .withIsGarden(true)
                .withAdress("Kasztanowa Borkowo")
                .build();*/

        Home Jednorodzinny=new Home.HomeBuilder()
                .withArea(120)
                .withCountFloor(1)
                .withRoom("Kuchnia",8)
                .withRoom("Salon",20)
                .withRoom("Wc",5)
                .withTypeRoof(TypeRoof.FLAT)
                .withTypeHeating(HeatingSource.OIL)
                .withGarage(true)
                .withGarden(true)
                .withAdress("Kasztanowa Borkowo")
                .build();

        System.out.println(Jednorodzinny);
    }




}

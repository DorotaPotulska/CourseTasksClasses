package JavaGda34.weekend9_wzorceProjektowe.zad2;

import java.util.ArrayList;
import java.util.List;

public class Home {

    private double area;
    private int countFloor;
    //private int countRoom;
    private List<Room>rooms;
    private TypeRoof typeRoof;
    private HeatingSource heatingSource;
    private boolean isGarage;
    private boolean isGarden;
    private String adress;

    public Home(double area, int countFloor, List<Room> rooms  /*int countRoom*/, TypeRoof typeRoof, HeatingSource heatingSource, boolean isGarage, boolean isGarden, String adress) {
        this.area = area;
        this.countFloor = countFloor;
        //this.countRoom = countRoom;
        this.rooms=rooms;
        this.typeRoof = typeRoof;
        this.heatingSource = heatingSource;
        this.isGarage = isGarage;
        this.isGarden = isGarden;
        this.adress = adress;
    }


    @Override
    public String toString() {
        return "Home{" +
                "area=" + area +
                ", countFloor=" + countFloor +
                ", room=" + rooms +
                ", typeRoof=" + typeRoof +
                ", typeHeating=" + heatingSource +
                ", isGarage=" + isGarage +
                ", isGarden=" + isGarden +
                ", adress='" + adress + '\'' +
                '}';
    }

    public static class HomeBuilder {
        private double area;
        private int countFloor;
        //private int countRoom;
        private List<Room>rooms= new ArrayList<Room>();
        private TypeRoof typeRoof;
        private HeatingSource heatingSource;
        private boolean isGarage;
        private boolean isGarden;
        private String adress;


        public HomeBuilder withArea(double area) {
            this.area = area;
            return this;
        }

        public HomeBuilder withCountFloor(int countFloor) {
            this.countFloor = countFloor;
            return this;
        }
        public HomeBuilder withRoom(String name, double area) {
            Room room = new Room(name, area);
            this.rooms.add(room);
            return this;
        }
        /*public HomeBuilder withCountRoom(int countRoom) {
            this.countRoom = countRoom;
            return this;
        }*/

        public HomeBuilder withTypeRoof(TypeRoof typeRoof) {
            this.typeRoof = typeRoof;
            return this;
        }

        public HomeBuilder withTypeHeating(HeatingSource heatingSource) {
            this.heatingSource = heatingSource;
            return this;
        }

        public HomeBuilder withGarage(boolean garage) {
            this.isGarage = garage;
            return this;
        }

        public HomeBuilder withGarden(boolean garden) {
            this.isGarden = garden;
            return this;
        }

        public HomeBuilder withAdress(String adress) {
            this.adress = adress;
            return this;
        }

        public Home build() {
            if (area <= 0) {
                throw new IllegalArgumentException("Area is zero or minus");
            }
            if (countFloor <= 0) {
                this.countFloor = 1;
            }
            if (rooms ==null) {
                throw new IllegalArgumentException("Count must be present");
            }
            if (adress == null) {
                throw new IllegalArgumentException("Adress must be present");
            }

            return new Home(this.area, this.countFloor, this.rooms, this.typeRoof,this.heatingSource, this.isGarage, this.isGarden, this.adress);
        }
    }
}

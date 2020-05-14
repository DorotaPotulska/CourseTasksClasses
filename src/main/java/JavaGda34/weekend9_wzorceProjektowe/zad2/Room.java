package JavaGda34.weekend9_wzorceProjektowe.zad2;

public class Room {

    private String name;
    private double area;

    public Room(String name, double area) {
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}

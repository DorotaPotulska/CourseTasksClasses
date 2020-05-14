package JavaGda34.weekend9_wzorceProjektowe.zad1_Builder;

public class Main {
    public static void main(String[] args) {
//        Computer burek = new Computer("Intel i5", 2.4, "Nvidia", "Asus RUDN364", 8192, 256, DiskType.SSD, 400);

        Computer burek2 = new Computer.ComputerBuilder()
                .withRamSize(8 * 1024)
                .withDisk(500, DiskType.SSD)
                .withDisk(1000, DiskType.HDD)
                .withProcessor("Intel i5", 2.4)
                .withPowerSupplyValue(400)
                .withMotherboardModel("Asus cośtam")
                .build();

        System.out.println(burek2);
    }
}
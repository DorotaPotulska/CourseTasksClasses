package JavaGda34.weekend9_wzorceProjektowe.zad1_Builder;

public class Disk {
    private int diskSize; // in GB
    private DiskType diskType;

    public Disk(int diskSize, DiskType diskType) {
        this.diskSize = diskSize;
        this.diskType = diskType;
    }

    public int getDiskSize() {
        return diskSize;
    }

    public DiskType getDiskType() {
        return diskType;
    }

    @Override
    public String toString() {
        return "Disk{" +
                "diskSize=" + diskSize +
                ", diskType=" + diskType +
                '}';
    }
}

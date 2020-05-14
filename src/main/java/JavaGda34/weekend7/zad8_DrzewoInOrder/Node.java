package JavaGda34.weekend7.zad8_DrzewoInOrder;

public class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }

    @Override
    public String toString() {
        return value + "";
    }
}


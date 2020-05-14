package JavaGda34.weekend7.zad8_DrzewoInOrder;

import java.util.ArrayList;
import java.util.List;

public class MyBST {

    private Node root;

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    public List<Node> InOrder(){
        List<Node> listaWezlow = new ArrayList<>();
        recursiveInOrder(root, listaWezlow);
        return listaWezlow;
    }

    private void recursiveInOrder(Node current, List<Node> alreadyVisited) {
        if (current.left != null) {
            recursiveInOrder(current.left, alreadyVisited); // 2.Left sub-tree
        }
        alreadyVisited.add(current); // 1.Node
        if (current.right != null) {
            recursiveInOrder(current.right, alreadyVisited); // 3.Right sub-tree
        }

    }
}

package JavaGda34.weekend7.zad2_Stos;

public class Main {
    public static void main(String[] args) {
        int[] stos = new int[]{1, 2, 3, 4, 5};
        MyStack mojStos = new MyStack(stos, 5);
        System.out.println(mojStos);
        for (int i = 0; i < mojStos.wierzcholekStosu; i++) {
            System.out.println(stos[i]);
        }
        System.out.println("Sprawdzenie czy stos jest pusty");
        mojStos.isEmpty();
        System.out.println("Wyswietlenie ostatniego elementu stosu");
        System.out.println(mojStos.peek());
        System.out.println("Zrzucenie");
        mojStos.pop();
        for (int i = 0; i < mojStos.wierzcholekStosu; i++) {
            System.out.println(stos[i]);
        }
        mojStos.push(6);
        for (int i = 0; i < mojStos.wierzcholekStosu; i++) {
            System.out.println(stos[i]);
        }
        mojStos.push(6);
        mojStos.push(6);
        mojStos.push(6);
        for (int i = 0; i < mojStos.wierzcholekStosu; i++) {
            System.out.println(stos[i]);
        }
    }
}

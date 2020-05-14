package JavaGda34.weekend7.zad4_StosFunkcje;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
/**
 * Funkcja działa analogicznie do balancedParens, ale sprawdza także
 * poprawne zagnieżdzenie nawiasów kwadratowych "[", "]" oraz klamrowych "{", "}".
 *
 * Np. dla "[(){}]" zwraca true, ale dla "[(])" zwraca false.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(balancedParens("(())"));
        System.out.println(balancedParens("())))))"));
        System.out.println(balancedParens("{[()]}"));
        System.out.println(balancedParens("{[((])]}"));
    }


    public static boolean balancedParens(String input) {
        boolean balanced = false;
        Deque<Character> stosNawiasow = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '('|| input.charAt(i)=='{'||input.charAt(i)=='[') {
                stosNawiasow.push(input.charAt(i));
            } else {
                try {
                    if ((input.charAt(i)==')' && stosNawiasow.peek().equals('('))||(input.charAt(i)==']' && stosNawiasow.peek().equals('['))||input.charAt(i)=='}' && stosNawiasow.peek().equals('{')){
                    stosNawiasow.pop();
                    }
                } catch (NoSuchElementException e) {
                    return balanced;
                }catch (NullPointerException a){
                    return balanced;
                }

            }
        }

        if (stosNawiasow.isEmpty()) {
            balanced = true;
        }

        return balanced;
    }
}

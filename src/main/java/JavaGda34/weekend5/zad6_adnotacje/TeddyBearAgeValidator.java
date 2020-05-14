package JavaGda34.weekend5.zad6_adnotacje;

import java.lang.reflect.Field;

public class TeddyBearAgeValidator {

    public static boolean validate(Object o) throws IllegalAccessException {
        // z obiektu pobieram jego pola
        Field[] fields = o.getClass().getDeclaredFields();
        // dla każdego pola robie sprawdzenie czy posiada moja adnotacje
        for (Field field : fields) {
            MaxLength annotation = field.getAnnotation(MaxLength.class);
            if (annotation != null) {
                // dla adnotacji weryfikuje czy istnieje (jeśli nie istnieje: annotation == null)


                field.setAccessible(true);
                // upubliczniam metodę
                String name =(String)(field.get(o));
                // pobieram wartość pola field z obiektu o
                if (name.length()< annotation.maxLength() || name.length() > annotation.maxLength()) {
                    // weryfikuje wartość z min/max z adnotacji
                    return false;
                    // wartość wykracza poza zakres
                }
                field.setAccessible(false);
                // uprywatniam metodę
            }
        }
        return true;

    }
}

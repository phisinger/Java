import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * stream
 */
public class stream {
    public static String methodRef(String s) {
        return s + "2";
    }

    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            liste.add("" + i);
        }

        liste.stream() // Keyword für Java8 Collections
            .map(stream::methodRef) // .map erwartet Rückgabewert -> return String
            .distinct() // alle Werte kommen nur noch ein mal vor
            .forEach(string -> {
                // System.out.print(string);
                System.out.println(string); // Code-Blöcke gehen auch
            });

        Optional<Integer> result = liste.stream() // .reduce liefert ein Optional zurück! "Kann was drin sein, muss aber nicht"
            .map(string -> string.length()) // .map funktioniert auch mit Lambdas
            .reduce((eins, zwei) -> eins + zwei);// .reduce reduziert alle Werte (paarweise) aus der Liste zu einem, basierend auf Lambda
        System.out.println(result);

        Optional<String> optional = Optional.empty();
        System.out.println(optional);
        System.out.println(optional.isPresent());
    }
}
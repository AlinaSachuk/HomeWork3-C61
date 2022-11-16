import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class HW15 {
    public static void main(String[] args) {
        HashMap<Integer, String> idName = new HashMap<>();
        idName.put(1, "Willy");
        idName.put(3, "Patrick");
        idName.put(2, "Teddy");
        idName.put(5, "Harry");
        idName.put(16, "Katniss");
        idName.put(7, "Hanna");
        idName.put(14, "Anastasia");
        idName.put(9, "Kira");
        idName.put(12, "Alan");
        idName.put(13, "Serena");
        ArrayList names = (ArrayList) idName.entrySet().stream().
                filter(n -> (n.getKey() == 1) || (n.getKey() == 2) || (n.getKey() == 5) || (n.getKey() == 8) || (n.getKey() == 9) || (n.getKey() == 13)).
                map(n -> n.getValue()).filter(n -> n.length() % 2 != 0).map(n -> new StringBuffer(n).reverse()).
                collect(Collectors.toList());
        System.out.println(names);
    }
}

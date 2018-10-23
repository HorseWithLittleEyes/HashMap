import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashMap myMap = new HashMap();
        myMap.put(1, "Hello");
        myMap.put(2, "Bye");
        Iterator myIt = myMap.entrySet().iterator();

        while(myIt.hasNext())
        {
            Map.Entry pair = (Map.Entry) myIt.next();
            System.out.println(pair.getKey()+" = "+pair.getValue());
        }

        System.out.println("Recursion practice.");




    }
}

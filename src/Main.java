import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

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
        System.out.println("Printing factorials");
        System.out.print("Enter number: ");
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        for (int i = 1; i <= number; i++)
            System.out.println(i+"! = "+factorial(i));
    }

    public static int factorial(int n)
    {
        if (n < 0)
            return 0;
        if (n == 1)
            return 1;
        else
            return n * factorial(n-1);
    }
}

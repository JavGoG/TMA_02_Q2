//(Q2)(a)

import java.util.ArrayList;
import java.util.HashMap;

//(Q2)(b)
public class BusRoutes {
    //    public field for testing purposes
    public HashMap<Integer, ArrayList<String>> routes;
    private InputReader reader;

    /**
     * Provided method to populate routes with test data
     * (Q2)(c)
     */
    public void populateRoutes() {
        ArrayList<String> stops = new ArrayList<>();
        stops.add("High Street");
        stops.add("Acacia Avenue");
        stops.add("Brown Street");
        stops.add("Broadway");
        stops.add("Station");
        routes.put(32, stops);

        ArrayList<String> stops1 = new ArrayList<>();
        stops1.add("High Street");
        stops1.add("Hospital");
        stops1.add("Brown Street");
        stops1.add("School");
        stops1.add("Station");
        routes.put(13, stops1);

        ArrayList<String> stops2 = new ArrayList<>();
        stops2.add("Bank");
        stops2.add("Hospital");
        stops2.add("Brown Street");
        stops2.add("School");
        stops2.add("Terminus");
        routes.put(22, stops2);
    }

    //(Q2)(c)
    public BusRoutes() {
        routes = new HashMap<>();
        reader = new InputReader();
        populateRoutes();
    }

    //    (Q2)(d)
    public void printRoute(int busNum) {
        System.out.println("Bus number " + busNum + " route: ");
    }
    //    (Q2)(e)
    public void printAllRoutes()
    {
        printRoute(32);
        routes.get(32).forEach(System.out::println);
        System.out.println("");
        printRoute(22);
        routes.get(22).forEach(System.out::println);
        System.out.println("");
        printRoute(13);
        routes.get(13).forEach(System.out::println);
    }




    public static void main(String[] args) {
        BusRoutes busRoutes = new BusRoutes();
        busRoutes.printAllRoutes();
    }
}


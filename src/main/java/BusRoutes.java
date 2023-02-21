//(Q2)(a)

import java.util.*;
import java.util.stream.Collectors;

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
        ArrayList<String> route = routes.get(busNum);
        route.stream().forEach(System.out::println);
    }

    //    (Q2)(e)
    public void printAllRoutes() {
        printRoute(32);
        routes.get(32).forEach(System.out::println);
        System.out.println("");
        printRoute(22);
        routes.get(22).forEach(System.out::println);
        System.out.println("");
        printRoute(13);
        routes.get(13).forEach(System.out::println);
    }

    //    (Q2)(f)
    public HashSet<Integer> getBusesStoppingHere(String aStop) {
        final HashSet<Integer> integers = new HashSet<>();
        ArrayList<String> thirtyTwo = routes.get(32);
        ArrayList<String> twentyTwo = routes.get(22);
        ArrayList<String> thirteen = routes.get(13);

        if (twentyTwo.contains(aStop)) {
            integers.add(22);
        }
        if (thirteen.contains(aStop)) {
            integers.add(13);
        }
        if (thirtyTwo.contains(aStop)) {
            integers.add(32);
        }
        return integers;
    }

    //(Q2)(g)
    public HashMap<String, HashSet<Integer>> getStopsAndBusNumbers()
    {
        HashMap<String, HashSet<Integer>> stopsMap = new HashMap<>();
        BusRoutes busRoutes = new BusRoutes();

        final Collection<ArrayList<String>> values = routes.values();
        ArrayList<String> stops = (ArrayList<String>) values.stream().flatMap(x->x.stream()).collect(Collectors.toList());
        for (String stop : stops) {

             if (routes.get(13).contains(stop)){
                 stopsMap.put(stop,busRoutes.getBusesStoppingHere(stop));
             }
            if (routes.get(22).contains(stop)){
                stopsMap.put(stop,busRoutes.getBusesStoppingHere(stop));
            }
            if (routes.get(32).contains(stop)){
                stopsMap.put(stop,busRoutes.getBusesStoppingHere(stop));
            }
        }
        return stopsMap;
    }

//(Q2)(h)
    public void accessInfoService()
    {

        System.out.println("Welcome to the Bus Information Service.");
        System.out.print("Type where you want to go to -> ");
        InputReader inputReader = new InputReader();
        BusRoutes busRoutes = new BusRoutes();
        HashSet<Integer> service = busRoutes.getBusesStoppingHere(inputReader.getInput());
        if(service.isEmpty()) {
            System.out.print("Sorry, no buses go there");
        }else {
            System.out.println('\n'+ "Here is a list of buses: ");
            for (Integer ser: service) {
                System.out.println(ser);
            }
            System.out.println("");
            System.out.println("Enter bus number to get a full route -> ");
            System.out.println("");
            busRoutes.printRoute(new Integer(inputReader.getInput()));
        }
    }
}


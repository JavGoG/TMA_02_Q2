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
    public void populateRoutes()
    {
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
public BusRoutes()
{
    routes = new HashMap<>();
    reader = new InputReader();
    populateRoutes();
}











    public static void main(String[] args) {
        HashMap<String,String> caca = new HashMap<>();
    }
}

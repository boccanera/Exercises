package dio.Collection.Map;

import java.util.*;

public class Cars {

    /*
With this data do:
 model = gol - consumption = 14,4km/l
 model = uno - consumption= 15,6 km/l
 model = mobi - consumption = 16,1 km/l
 model = hb20 - consumption = 14,5 km/l
 model = kwid - consumption = 15,6 km/l
 */

//        Map popularCars = new HashMap(); //antes do java 5
//        Map<String, Double> popularCars = new HashMap<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
//        HashMap<String, Double> popularCars = new HashMap<>();
//        Map<String, Double> popularCars = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6)


    public static void main(String[] args) {

        System.out.println("Create a map: ");
    Map<String, Double> popularCars = new HashMap<>() {{
        put("gol", 14.4);
        put("uno", 15.6);
        put("mobi", 16.1);
        put("hb20", 14.5);
        put("kwid", 15.6);
    }};
        System.out.println(popularCars.toString());

        System.out.println("Overwrite the consumption of gol to 15.2 ");
        popularCars.put("gol", 15.2);
        System.out.println(popularCars);

        System.out.println("Check if tucson is on the list " + popularCars.containsKey("tucson"));

        System.out.println("Show the consumption of uno " + popularCars.get("uno"));

//        System.out.println("Show the third model added ");

        System.out.println("Show the car models ");
    Set<String> modelos = popularCars.keySet();
        System.out.println(modelos);


        System.out.println("Show the cars consumption ");
    Collection<Double> consumos = popularCars.values();
        System.out.println(consumos);

        System.out.println("Show the most economic and its consumption ");

    Double mostEfficientConsumption = Collections.max(popularCars.values());
    Set<Map.Entry<String, Double>> entries = popularCars.entrySet();
    String mostEfficientModel = "";

        for (Map.Entry<String, Double> entry : entries) {
        if (entry.getValue().equals(mostEfficientConsumption)) {
            mostEfficientModel = entry.getKey();
            System.out.println("Show the most efficient " + mostEfficientModel + " - " + mostEfficientConsumption);
        }
    }

        System.out.println("Show the less economic model and its consumption " );

    Double lessEfficientConsumption = Collections.min(popularCars.values());
    String lessEfficientModel = "";
        for (Map.Entry<String, Double> entry: popularCars.entrySet()) {
        if(entry.getValue().equals(lessEfficientConsumption)) {
            lessEfficientModel = entry.getKey();
            System.out.println("Less efficient model " + lessEfficientModel + " - " + lessEfficientConsumption);
        }
    }

    Iterator<Double> iterator = consumos.iterator();
    Double sum = 0d;
        while(iterator.hasNext()){
        sum += iterator.next();
    }
        System.out.println("Show the sum of consumptions " + sum);

        System.out.println("Show the consumption average " + (sum/popularCars.size()));

        System.out.println(popularCars);
        System.out.println("Remove the model with 15,6 km/l: ");
    Iterator<Double> iterator1 = popularCars.values().iterator();
        while(iterator1.hasNext()){
        if(iterator1.next().equals(15.6)) iterator1.remove();
    }
        System.out.println(popularCars);

        System.out.println("Display all the cars in the insertion order ");
    Map<String, Double> popularCars1 = new LinkedHashMap<>() {{
        put("gol", 14.4);
        put("uno", 15.6);
        put("mobi", 16.1);
        put("hb20", 14.5);
        put("kwid", 15.6);
    }};
        System.out.println(popularCars1.toString());

        System.out.println("Display in the alphabetic order ");
    Map<String, Double> popularCars2 = new TreeMap<>(popularCars1);
        System.out.println(popularCars2.toString());

        System.out.println("Erase the vector ");
        popularCars.clear();

        System.out.println("Check if its empty " + popularCars.isEmpty());
}
}


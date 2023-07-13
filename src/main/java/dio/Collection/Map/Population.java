package dio.Collection.Map;
import java.util.*;
    /*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */



public class Population {

    public static void main(String[] args) {

        Map<String, Integer> statePopulation = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        System.out.println("Population per State: " + statePopulation);

        System.out.println("Overwrite the RN population to 3.534.165");
        statePopulation.put("RN", 3534165);
        System.out.println(statePopulation);

        System.out.println("Check if PB is listed, if not, add PB - 4.039.277: ");
        if (!statePopulation.containsKey("PB")) {
            statePopulation.put("PB", 4039277);
            System.out.println(statePopulation.get("PB"));
        }

        System.out.println("Display the population of PE " + statePopulation.get("PE"));


        System.out.println("Display all states and its population by insertion order ");
        Map<String, Integer> statePopulation1 = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(statePopulation1);

        System.out.println("Display all states and its population in alphabetic order ");
        Map<String, Integer> statePopulation2 = new TreeMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        System.out.printf("Display the smallest population and its state: ");
        Integer smallestPopulation = Collections.min(statePopulation.values());
        String smallerState = "";
        for (Map.Entry<String, Integer> entry : statePopulation.entrySet()) {
            if (entry.getValue().equals(smallestPopulation)) {
                smallerState = entry.getKey();
            }
        }
        System.out.println(smallerState + smallestPopulation);

        System.out.printf("Display the largest population and its state: ");
        Integer largestPopulation = Collections.max(statePopulation.values());
        String largestState = "";
        for (Map.Entry<String, Integer> entry : statePopulation.entrySet()) {
            if (entry.getValue().equals(largestPopulation)) {
                largestState = entry.getKey();
            }
        }
        System.out.println(largestState + largestPopulation);

        System.out.println("Display the population sum ");
        Iterator<Integer> iterator = statePopulation.values().iterator();
        Integer sum = 0;
        while (iterator.hasNext()) {
            sum += iterator.next();
        }
        System.out.println(sum);

        System.out.println("Display the population average ");
        Integer average = sum / statePopulation.size();
        System.out.println(average);

        System.out.println("Remove the states of population lesser than 4.000.000: ");
        Iterator<Integer> iterator1 = statePopulation.values().iterator();
        while (iterator.hasNext()) {
            if (iterator1.next() <= 4000000) iterator1.remove();
        }

        statePopulation.clear();
        System.out.println("Erase all and check it " + statePopulation.isEmpty());
    }
}



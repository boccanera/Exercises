package dio.Collection.Set;

import java.util.*;

/*create a vector with rainbowColors
List all colors
The quantity of it
Alphabetic order
Reverse order
All colors beginning with "v"
Remove all colors that don't initiate with "v"
Clear the vector
Check if its empty
 */
public class RainbowColors {

    public static void main(String[] args) {

        System.out.println("All colors: ");
        Set<String> colors = new HashSet<>();
        colors.add("violet");
        colors.add("orange");
        colors.add("yellow");
        colors.add("green");
        colors.add("blue");
        colors.add("indigo");
        colors.add("red");
        System.out.println(colors);

        System.out.println("One color in each line: ");
        for (String cor:colors) System.out.println(cor);

        System.out.println("Quantity of colors: " + colors.size());

        System.out.println("Alphabetic order: ");
        Set<String> colorsTreeSet = new TreeSet<>(colors);
        System.out.println(colorsTreeSet);

        System.out.println("Reverse order: " );
        Set<String> colorsLinkedHashSet = new LinkedHashSet<>(
        Arrays.asList("violet", "red", "orange", "yellow", "green", "blue", "indigo"));
        System.out.println(colorsLinkedHashSet);
        List<String> colorsReverse = new ArrayList<>(colorsLinkedHashSet);
        Collections.reverse(colorsReverse);
        System.out.println(colorsReverse);

        System.out.println("All colors beginning with 'v': ");
        for (String color: colors){
            if(color.startsWith("v")) System.out.println(color);
        }
//        System.out.println("Remove all colors that don't initiate with 'v': ");
//        Iterator<String> iterator = colors.iterator();
//        while (iterator.hasNext()){
//            if (!iterator.next().startsWith("v")) iterator.remove();
//        }
       // I improved the method with removeIf
        System.out.println("Remove all colors that don't initiate with 'y': ");
        Iterator<String> iterator = colors.iterator();
        colors.removeIf(n -> (n.toLowerCase().charAt(0) == 'y'));
        System.out.println(colors);

        System.out.println("Clear the vector: ");
        colors.clear();

        System.out.println("Check if its empty " + colors.isEmpty());
        }
}

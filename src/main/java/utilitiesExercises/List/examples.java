package utilitiesExercises.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//examples to train with List

public class examples {

    public static void main(String[] args) {

        List<Double> scores = new ArrayList<Double>();
        scores.add(7d);
        scores.add(8.5);
        scores.add(9.3);
        scores.add(5.0);
        scores.add(7.0);
        scores.add(0d);
        scores.add(3.6);
        scores.add(8d);
        System.out.println("All colors " + scores.toString());

        System.out.println("The position of the score 5: " + scores.indexOf(5d));

        System.out.println("Add the score 8.0 in the position 4: ");
        scores.add(3, 8.0);

        System.out.println(scores);

        System.out.println("Replace 5.0 with 6.0 ");
        scores.set(scores.indexOf(5.0), 6.0);
        System.out.println(scores);

        System.out.println("Check if score 5.0 is in the list: " + scores.contains(5.0));

        System.out.println("Show the 3 score " + scores.get(2));

        System.out.println("Show the lowest score " + Collections.min(scores));
        System.out.println("Show the higher score " + Collections.max(scores));

        Iterator<Double> iterator = scores.iterator();
        Double sum = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            sum += next;
        }
        System.out.println("Sum of the scores " + sum);

        System.out.println("Average " + (sum / scores.size()));

        System.out.println("Remove the score 8 ");
        scores.removeAll(Collections.singleton(8d));
        System.out.println(scores);

        System.out.println("Remove the score in the position 3 ");
        scores.remove(2);
        System.out.println(scores);

        System.out.println("Remove the scores under 7 ");
        Iterator<Double> iterator1 = scores.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(scores);

        scores.clear();
        System.out.println("It's empty" + scores.isEmpty());

    }
}


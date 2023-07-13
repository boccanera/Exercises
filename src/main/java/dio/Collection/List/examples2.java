package dio.Collection.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class examples2 {

    /*Create a list and sort with this info:
(name - age - color);
cat1 = nome: Jon, age: 18, cor: black
cat2 = nome: Simba, age: 6, cor: tiger
cat3 = nome: Jon, age: 12, cor: yellow

Steps: variables, constructor, get, override toString() and comparators.
*/

    public static void main(String[] args) {

        List<Cat> myCats = new ArrayList<>(){{
            add(new Cat("John", 12, "black"));
            add(new Cat("Tyler", 18, "yellow"));
            add(new Cat("Simba", 6, "tiger"));

        }};
        myCats.sort(Comparator.comparing(Cat::getName));

        System.out.println("Insertion order " + myCats);

        System.out.println("Random order ");
        Collections.shuffle(myCats);
        System.out.println(myCats);

        System.out.println("By name");
        Collections.sort(myCats);
        System.out.println(myCats);

        System.out.println("By age");
        Collections.sort(myCats, new ComparatorAge());
        System.out.println(myCats);

        System.out.println("By Color");
        Collections.sort(myCats, new ComparatorColor());
        System.out.println(myCats);

        System.out.println("By Name/Color/Age");
        Collections.sort(myCats, new ComparatorNameColorAge());

    }

}

class Cat implements Comparable<Cat> {

    private String name;
    private Integer age;
    private String color;


    public Cat(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cat cat) {
        return this.getName().compareToIgnoreCase(cat.getName());
    }
}

class ComparatorAge implements Comparator<Cat> {

    @Override
    public int compare(Cat c1, Cat c2) {
        return Integer.compare(c1.getAge(), c2.getAge());
    }
}

class ComparatorColor implements Comparator<Cat> {

    @Override
    public int compare(Cat c1, Cat c2) {
        return c1.getColor().compareToIgnoreCase(c2.getColor());
    }
}

class ComparatorNameColorAge implements Comparator<Cat>{

    @Override
    public int compare(Cat g1, Cat g2){
        int name = g1.getName().compareToIgnoreCase(g2.getName());
        if (name != 0) return name;

        int color = g1.getColor().compareToIgnoreCase(g2.getColor());
        if(color !=0) return color;

        return Integer.compare(g1.getAge(), g2.getAge());
    }
}




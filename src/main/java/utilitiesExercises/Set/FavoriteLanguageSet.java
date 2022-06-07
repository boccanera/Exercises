package utilitiesExercises.Set;


/*
Create a FavoriteLanguage class with name, creationDate and IDE.
Build in a vector and display
a) Insertion Order
b) Natural Order (name);
c) IDE;
d) CreationDate and name;
e) Name, CreationDate, IDE;
All languages, one under another.
*/

import java.util.*;

public class FavoriteLanguageSet {

    public static void main(String[] args) {
    Set<FavoriteLanguage> myFavoriteLanguage = new HashSet<>();
    myFavoriteLanguage.add(new FavoriteLanguage("Python", 1991, "Pycharm"));
    myFavoriteLanguage.add(new FavoriteLanguage("Javascript", 1995, "Visual Studio"));
    myFavoriteLanguage.add(new FavoriteLanguage("Java", 1991, "Intellij"));

        System.out.println("--------\tInsertion Order\t--------");
        Set<FavoriteLanguage> myFavoriteLanguage1 = new LinkedHashSet<>(
                Arrays.asList(
                        new FavoriteLanguage("Python", 1991, "Pycharm"),
                        new FavoriteLanguage("JavaScript", 1995, "Visual Studio"),
                        new FavoriteLanguage("Java", 1991, "Intellij")));

    for (FavoriteLanguage language : myFavoriteLanguage1) System.out.println(language);

    System.out.println("--------\tNatural Order: Name\t--------");
    Set<FavoriteLanguage> myFavoriteLanguage2 = new TreeSet<>(myFavoriteLanguage);
        for(FavoriteLanguage language :myFavoriteLanguage2) System.out.println(language);

        System.out.println("--------\tIDE Order\t--------");
        Set<FavoriteLanguage> myFavoriteLanguage3 = new TreeSet<FavoriteLanguage>(new ComparatorIde());
        myFavoriteLanguage3.addAll(myFavoriteLanguage);
        for (FavoriteLanguage language : myFavoriteLanguage3) System.out.println(language);

        System.out.println("--------\tDate of Creation > Name Order\t--------");
        Set<FavoriteLanguage> myFavoriteLanguage4 = new TreeSet<FavoriteLanguage>(new ComparatorCreationDateAndName());
        myFavoriteLanguage4.addAll(myFavoriteLanguage);
        for (FavoriteLanguage language : myFavoriteLanguage4) System.out.println(language);

        System.out.println("--------\tName > Date of Creation > IDE Order\t--------");
        Set<FavoriteLanguage> myFavoriteLanguage5 = new TreeSet<FavoriteLanguage>(new ComparatorNameCreationDateIde());
        myFavoriteLanguage5.addAll(myFavoriteLanguage3);
        for (FavoriteLanguage language : myFavoriteLanguage5) System.out.println(language);
    }
}


class FavoriteLanguage implements  Comparable<FavoriteLanguage> {
    public String name;
    public Integer creationDate;
    public String ide;

    public FavoriteLanguage(String nome, Integer creationDate, String ide) {
        this.name = nome;
        this.creationDate = creationDate;
        this.ide = ide;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + name + '\'' +
                ", creationDate=" + creationDate +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public int compareTo(FavoriteLanguage favoriteLanguage) {
        return this.name.compareTo(favoriteLanguage.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FavoriteLanguage that = (FavoriteLanguage) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

    class ComparatorIde implements Comparator<FavoriteLanguage> {

        @Override
        public int compare(FavoriteLanguage fl1, FavoriteLanguage fl2) {
            return fl1.ide.compareToIgnoreCase(fl2.ide);
        }
    }

    class ComparatorCreationDateAndName implements Comparator<FavoriteLanguage> {

        @Override
        public int compare(FavoriteLanguage fl1, FavoriteLanguage fl2) {
            int creationDate = Integer.compare(fl1.creationDate, fl2.creationDate);
            if (creationDate != 0) return creationDate;
            return fl1.name.compareToIgnoreCase(fl2.name);
        }
    }

        class ComparatorNameCreationDateIde implements Comparator<FavoriteLanguage> {

            @Override
            public int compare(FavoriteLanguage fl1, FavoriteLanguage fl2) {
                int name = fl1.name.compareToIgnoreCase(fl2.name);
                int creationDate = Integer.compare(fl1.creationDate, fl2.creationDate);
                if (name != 0) return name;
                if (creationDate != 0) return creationDate;
                return fl1.name.compareToIgnoreCase(fl2.name);
            }
        }





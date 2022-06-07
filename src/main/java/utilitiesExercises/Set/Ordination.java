package utilitiesExercises.Set;
import java.util.*;

/*Create with Set and put in order the name, genre and time of an episode.

Steps: variables, constructor, get, override toString(),
override equals and hashCode.

selfReminder: HashSet MAY randomize the order.

*/



public class Ordination {

    public static void main(String[] args) {

        System.out.println("--\tRandom order\t--");
        Set<Serie> listSeries = new HashSet<>(){{
            add(new Serie("Berry", "Drama", 30));
            add(new Serie("La Casa de Papel", "Action", 50));
            add(new Serie("Bosch", "Thriller", 50));
        }};
        for (Serie serie: listSeries) System.out.println(serie.getName() + ", " +
                serie.getGender() + ", " + serie.getEpisodeTime());

        System.out.println("\n==Insertion order==");
        Set<Serie> listSeries1 = new LinkedHashSet<>(){{
            add(new Serie("Berry", "Drama", 30));
            add(new Serie("La Casa de Papel", "Action", 50));
            add(new Serie("Bosch", "Thriller", 50));
        }};
        for (Serie serie: listSeries1) System.out.println(serie.getName() + ", " +
                serie.getGender() + ", " + serie.getEpisodeTime());

        System.out.println("\n==Natural order==");
        Set<Serie> listSeries2 = new TreeSet<>(listSeries1);
        for (Serie serie: listSeries2) System.out.println(serie.getName() + ", " +
                serie.getGender() + ", " + serie.getEpisodeTime());

        System.out.println("\n==Name/Gender/Age Order==");
        Set<Serie> listSeries3 = new TreeSet<>(new CompareNameGenderTime());
        listSeries3.addAll(listSeries);
        for (Serie serie: listSeries3) System.out.println(serie.getName() + ", " +
                serie.getGender() + ", " + serie.getEpisodeTime());





    }


}

class Serie implements Comparable<Serie>{
    private String name;
    private String gender;
    private Integer episodeTime;

    public Serie(String name, String gender, Integer episodeTime) {
        this.name = name;
        this.gender = gender;
        this.episodeTime = episodeTime;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Integer getEpisodeTime() {
        return episodeTime;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", episodeTime=" + episodeTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return name.equals(serie.name) && gender.equals(serie.gender) && episodeTime.equals(serie.episodeTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, episodeTime);
    }

    @Override
    public int compareTo(Serie serie) {
        int episodeTime = Integer.compare(this.getEpisodeTime(), serie.getEpisodeTime());
        if (episodeTime != 0) return episodeTime;
        return this.getGender().compareTo(serie.getGender());
    }
}

class CompareNameGenderTime implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getName().compareTo(s2.getName());
        if (nome != 0)  return nome;

        int genero = s1.getGender().compareTo(s2.getGender());
        if (genero != 0) return genero;

        return Integer.compare(s1.getEpisodeTime(), s2.getEpisodeTime());
    }
}


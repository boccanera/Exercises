package utilitiesExercises.Map;

import java.util.*;

/*Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário:
exibindo (Nome Autor - Nome Livro);
Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432
*/

public class BooksExample {

    public static void main(String[] args) {

        System.out.println("--\tRandom Order\t--");
        Map<String, Book> randomOrder = new HashMap<>() {{
            put(" Hawking, Stephen", new Book("A Brief History of Time:From the Big Bang to Black Holes", 256));
            put(" Duhigg, Charles", new Book("The Power of Habit", 408));
            put(" Harari, Yuval Noah", new Book("21 lesson for the 21st century.", 432));
        }};
        for (Map.Entry<String, Book> book : randomOrder.entrySet())
            System.out.println(book.getKey() + " - " + book.getValue().getName());

        System.out.println("--\tInsertion Order\t--");
        Map<String, Book> myBooks1 = new LinkedHashMap<>() {{
            put(" Hawking, Stephen", new Book("A Brief History of Time:From the Big Bang to Black Holes", 256));
            put(" Duhigg, Charles", new Book("The Power of Habit", 408));
            put(" Harari, Yuval Noah", new Book("21 lesson for the 21st century.", 432));
        }};
        for (Map.Entry<String, Book> book : myBooks1.entrySet())
            System.out.println(book.getKey() + " - " + book.getValue().getName());

        System.out.println("--\tAlphabetic order by authors\t--");
        Map<String, Book> myBooks2 = new TreeMap<>(myBooks1);
        for (Map.Entry<String, Book> book : myBooks2.entrySet())
            System.out.println(book.getKey() + " - " + book.getValue().getName());

        System.out.println("--\tAlphabetic order by title\t--");

        Set<Map.Entry<String, Book>> myBooks3 = new TreeSet<>(new ComparatorName());
        myBooks3.addAll(randomOrder.entrySet());
        for (Map.Entry<String, Book> livro : myBooks3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getName());

        System.out.println("--\tOrder by page number\t--");
        Set<Map.Entry<String, Book>> myBooks4 = new TreeSet<>(new ComparatorPages());
        myBooks4.addAll(randomOrder.entrySet());
        for (Map.Entry<String, Book> livro : myBooks4)
            System.out.println(livro.getKey() + " - " + livro.getValue().getPages());


    }
}

class Book {
    private String name;
    private Integer pages;

    public Book(String name, Integer pages) {
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public Integer getPages() {
        return pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book livro = (Book) o;
        return name.equals(livro.name) && pages.equals(livro.pages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pages);
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }
}

class ComparatorName implements Comparator<Map.Entry<String, Book>> {

    @Override
    public int compare(Map.Entry<String, Book> l1, Map.Entry<String, Book> l2) {
        return l1.getValue().getName().compareToIgnoreCase(l2.getValue().getName());
    }

}


class ComparatorPages implements Comparator<Map.Entry<String, Book>>{

        @Override
    public int compare(Map.Entry<String, Book> l1, Map.Entry<String, Book> l2) {
        return l1.getValue().getPages().compareTo(l2.getValue().getPages());
    }
    }





package Task15;
import Task12.Book;
import java.util.Comparator;
public class Title implements Comparator<Book>{
    @Override 
    public int compare(Book o1, Book o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}

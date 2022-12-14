package Task15;
import Task12.Book;
import java.util.Comparator;
public class AuthorTitlePrice implements Comparator<Book> {
    
    @Override
    public int compare(Book o1, Book o2) {
        int AuthorCompare = o1.getAuthor().compareTo(o2.getAuthor());
        int TitleCompare = o1.getTitle().compareTo(o2.getTitle());
        int PriceCompare = o1.getPrice() - o2.getPrice();

        if (AuthorCompare == 0){
            return (TitleCompare == 0) ? PriceCompare : TitleCompare;
        }
        return AuthorCompare;
    }
}

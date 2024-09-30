import java.util.Comparator;

public class PageNoComparable implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return Integer.compare(o1.getPageNo(),o2.getPageNo());
    }
}

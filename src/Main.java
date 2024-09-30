import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<>(new AlphabeticComparable());

        Book book1 = new Book("The Great Gatsby", 180, "F. Scott Fitzgerald", "1925");
        Book book2 = new Book("To Kill a Mockingbird", 281, "Harper Lee", "1960");
        Book book3 = new Book("1984", 328, "George Orwell", "1949");
        Book book4 = new Book("Pride and Prejudice", 432, "Jane Austen", "1813");
        Book book5 = new Book("Moby Dick", 635, "Herman Melville", "1851");

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        for(Book b : books){
            System.out.println(b.getName());
        }

    }
}
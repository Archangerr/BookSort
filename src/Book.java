public class Book {
    private String Name;
    private int PageNo;
    private String AuthorName;
    private String Date;

    public Book(String name, int pageNo, String authorName, String date) {
        Name = name;
        PageNo = pageNo;
        AuthorName = authorName;
        Date = date;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPageNo() {
        return PageNo;
    }

    public void setPageNo(int pageNo) {
        PageNo = pageNo;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}

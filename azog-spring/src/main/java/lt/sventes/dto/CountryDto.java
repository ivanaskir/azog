package lt.sventes.dto;

public class CountryDto {
    private String title;
    private String author;
    private int pageCount;
    private String bookLogo;

    public CountryDto(){}

    public CountryDto(String title, String author, int pageCount, String bookLogo) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.bookLogo = bookLogo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getBookLogo() {
        return bookLogo;
    }

    public void setBookLogo(String bookLogo) {
        this.bookLogo = bookLogo;
    }
}

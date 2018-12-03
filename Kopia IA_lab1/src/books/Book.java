package books;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "book")
public class Book {
    
    private String id;
    private String title;
   // private String author;
    List<String> authors=new ArrayList<>();
    private String isbn;
    private Integer year;
    private String publisher;
    private Integer pages;

    public Book() {
    }

    public Book(String id, String title, List<String> authors, String isbn, Integer year, String publisher, Integer pages) {
        this.id = id;
        this.title = title;
        this.authors.addAll(authors);
        this.isbn = isbn;
        this.year = year;
        this.publisher = publisher;
        this.pages = pages;
    }

	@XmlAttribute
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List <String> getAuthors() {
        return authors;
		
    }

    public void setAuthors(List <String> author) {
        this.authors.addAll(authors);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", title=" + title + ", author=" + authors + '}';
    }
}

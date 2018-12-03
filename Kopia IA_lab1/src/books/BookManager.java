package books;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    
    private List<Book> books = new ArrayList<>();

    public BookManager(List<Book> books) {
        this.books = books;
    }
    
    public List<Book> searchByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains(title.toLowerCase())) {
                result.add(b);
            }
        }
        return result;
    }
    
   /* public List<Book> searchByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book b : books) {
            if (b.getAuthors().toLowerCase().contains(author.toLowerCase())) {
                result.add(b);
            }
        }
        return result;
    }*/
    
    public Book searchByISBN(String isbn) {
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                return b;
            }
        }
        return null;
    }
	
	public Book addBook(Book b) {
		if (b.getTitle().isEmpty() || b.getAuthors().isEmpty()) {
			throw new RuntimeException("nie ma tytułu");
		} else {
			books.add(b);
		}
		return b;
	}
}

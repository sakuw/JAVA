package books;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Main {

	public static void main(String[] args) {

		// odczyt
    /* try {
		 JAXBContext context = JAXBContext.newInstance(BookList.class);
		 Unmarshaller um = context.createUnmarshaller();
		 FileReader file = new FileReader("books.xml");
		 BookList books = (BookList) um.unmarshal(file);
		 file.close();
		 BookManager bm = new BookManager(books.getBooks());
		 List<Book> bs = bm.searchByTitle("Java");
		 System.out.println(bs);
			
		 // zapis
		 Marshaller m = context.createMarshaller();
		 FileWriter fiW = new FileWriter("labs.xml");
		
			
		 fiW.close();
		 
		 
		 } catch (Exception ex) {
		 ex.printStackTrace();
		 }

	 
		 // zapis
		 Book b1
		 = new Book(
		 "1",
		 "JakasNazwa",
		 "Autor",
		 "123456789",
		 666,
		 "sdasds",
		 72
		 );
	
		 */
		try {
			JAXBContext context = JAXBContext.newInstance(BookList.class);
			Unmarshaller um = context.createUnmarshaller();

			FileReader file = new FileReader("books.2.xml");
			BookList books = (BookList) um.unmarshal(file);

			file.close();

			BookManager bm = new BookManager(books.getBooks());
			List<String> new_book_authors = new ArrayList<>();
			new_book_authors.add("Michał Sak");

		Book ksiazka = new Book("1", "Laboratorium: Java i XML", new_book_authors, "111-222-333", 2018, "UCZELNIA WYDAWNICZA", 1);

		bm.addBook(ksiazka);

		List<Book> bs = bm.searchByTitle("Java");

		System.out.println(bs);
		BookList bls = new BookList();

		bls.setBooks(bs);

		System.out.println(bls);

		Marshaller m = context.createMarshaller();
		FileWriter fiW = new FileWriter("lab3.xml");

		m.marshal(bls, fiW);

		fiW.close();

	}
	catch (Exception ex

	
		) {
			ex.printStackTrace();
	}

}

}

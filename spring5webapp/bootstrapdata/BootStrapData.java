package guru.springframework.spring5webapp.bootstrapdata;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.repository.AuthorRepository;
import guru.springframework.spring5webapp.repository.BookRepository;

@Component
public class BootStrapData implements CommandLineRunner{

	private final AuthorRepository authorRespository;
	private final BookRepository bookRepository;
	
	/**
	 * @param authorRespository
	 * @param bookRepository
	 */
	public BootStrapData(AuthorRepository authorRespository, BookRepository bookRepository) {
		super();
		this.authorRespository = authorRespository;
		this.bookRepository = bookRepository;
	}



	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
			System.out.println("Hi in bootstrap run method..");
	}

/**
	 * @return the authorRespository
	 */
	public AuthorRepository getAuthorRespository() {
		return authorRespository;
	}

/**
 * @return the bookRepository
 */
public BookRepository getBookRepository() {
	return bookRepository;
}




Author Eric = new Author("Eric", "Evans");
Book myBook = new Book("Domain Driven Design", "123123");

Author eric = new Author("Eric", "Evans");
Book ddd = new Book("Domain Driven Design", "123123");





}




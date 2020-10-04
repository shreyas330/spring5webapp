package guru.springframework.spring5webapp.domain;

import javax.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Created by jt on 12/22/19.
 */
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String isbn;
    
    
    @ManyToMany
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authors = new HashSet<Author>();
    
    public Book() {
    	System.out.println("In contructor of book");
    }

    public Book(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
        
        System.out.println("In arg contructor of book"  + title + " " + isbn );
          }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

  	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Book)) {
			return false;
		}
		Book other = (Book) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", isbn=" + isbn + "]";
	}

	
	/**
	 * @return the authors
	 */
	public Set<Author> getAuthors() {
		System.out.println("In class book get Authors" + authors.toString());
		return authors;
	}

	/**
	 * @param authors the authors to set
	 */
	public void setAuthors(Set<Author> authors) {
		System.out.println("In class book Set Authors" + authors.toString());
		this.authors = authors;
	}

	
    
    
}

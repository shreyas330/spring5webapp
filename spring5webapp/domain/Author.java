package guru.springframework.spring5webapp.domain;

import javax.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Created by jt on 12/22/19.
 */
@Entity
public class Author {

	
	

	@Override
	public String toString() {
		return "Author [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
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
		if (!(obj instanceof Author)) {
			return false;
		}
		Author other = (Author) obj;
		return Objects.equals(id, other.id);
	}

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;

   @ManyToMany(mappedBy = "authors")
   private Set<Book> books = new HashSet<Book>();

    public Author() {
    	
    	System.out.println("in author ");
    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
                System.out.println("In args contructor author ");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

	/**
	 * @return the books
	 */
	public Set<Book> getBooks() {
		
		System.out.println("in getbooks:" + "books is" + books);
		return books;
	}

	/**
	 * @param books the books to set
	 */
	public void setBooks(Set<Book> books) {
		this.books = books;
		
		System.out.println("in setbooks:" + "books is" + books);
	}

   
    
}

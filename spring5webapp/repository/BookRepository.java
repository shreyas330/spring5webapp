/**
 * 
 */
package guru.springframework.spring5webapp.repository;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.domain.Book;

/**
 * @author 1576389
 *
 */
public interface BookRepository extends CrudRepository<Book, Long>{

}

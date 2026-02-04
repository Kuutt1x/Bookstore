package bookstore.backend.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByAuthor(String author);
    List<Book> findByTitle(String title);
    List<Book> findByTitleContainingIgnoreCase(String title);
    List<Book> findByPublicationYear(int publicationYear);
    Book findByIsbn(String isbn);

}

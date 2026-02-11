package bookstore.backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import bookstore.backend.model.Category;
import bookstore.backend.model.Book;
import bookstore.backend.model.BookRepository;
import bookstore.backend.model.CategoryRepository;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

  @Bean
    public CommandLineRunner demo(BookRepository bookRepository, CategoryRepository categoryRepository) {
    return (args) -> {

        bookRepository.deleteAll();
        categoryRepository.deleteAll();

        Category c1 = new Category("Fiction");
        Category c2 = new Category("Travel");
        


        categoryRepository.save(c1);
        categoryRepository.save(c2);

        Book b1 = new Book("Kirja1", "Tekijä1", 2025, "1232873-21", 8.90);
        b1.setCategory(c2);
        bookRepository.save(b1);

        Book b2 = new Book("Kirja2", "Tekijä2", 2025, "2212343-5", 9.90);
        b2.setCategory(c1);
        bookRepository.save(b2);
    };
}


}

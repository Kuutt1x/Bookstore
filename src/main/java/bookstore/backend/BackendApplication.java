package bookstore.backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import bookstore.backend.model.Book;
import bookstore.backend.model.BookRepository;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(BookRepository repository) {
        return (args) -> {

            repository.save(new Book("kirja1", "tekijä1", 1929, "1232323-21", 19.90));
            repository.save(new Book("kirja2", "tekijä2", 1945, "2212343-5", 15.90));

            System.out.println("fetch all books");
            for (Book book : repository.findAll()) {
                System.out.println(book);
            }
        };
    }

}

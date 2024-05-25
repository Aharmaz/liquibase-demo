package ma.demo.liquibase;

import ma.demo.liquibase.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiquibaseDemoApplication implements CommandLineRunner {
    private final BookRepository bookRepository;

    public LiquibaseDemoApplication(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(LiquibaseDemoApplication.class);
    }

    @Override
    public void run(String... args) {
        bookRepository.findAll()
                .forEach(book -> {
                    System.out.println(book.toString());
                });
    }
}
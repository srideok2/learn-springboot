package springframework.guru.spring5web.model.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.guru.spring5web.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}

package springframework.guru.spring5web.model.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.guru.spring5web.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}

package pl.rszczesiak.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.rszczesiak.spring5webapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}

package patika.bookadviserapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import patika.bookadviserapi.model.dto.request.BookDbSaveRequest;

@Repository
public interface BookRepository extends MongoRepository<BookDbSaveRequest, String> {
}

package patika.bookadviserapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import patika.bookadviserapi.model.Book;
import patika.bookadviserapi.model.dto.request.BookDbSaveRequest;
import patika.bookadviserapi.model.dto.response.BookResponse;

import java.util.Collection;
import java.util.List;

@Repository
public interface BookRepository extends MongoRepository<BookDbSaveRequest, String> {
}

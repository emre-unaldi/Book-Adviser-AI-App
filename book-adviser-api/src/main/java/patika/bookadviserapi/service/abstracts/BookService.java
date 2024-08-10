package patika.bookadviserapi.service.abstracts;

import patika.bookadviserapi.model.dto.request.BookDbSaveRequest;
import patika.bookadviserapi.model.dto.request.BookRequest;
import patika.bookadviserapi.model.dto.response.BookResponse;

import java.util.List;

public interface BookService {
    BookResponse findBooks(BookRequest bookRequest);
    List<BookDbSaveRequest> findAll();
}

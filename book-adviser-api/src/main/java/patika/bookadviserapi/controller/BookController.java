package patika.bookadviserapi.controller;

import lombok.Data;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import patika.bookadviserapi.model.dto.request.BookDbSaveRequest;
import patika.bookadviserapi.model.dto.request.BookRequest;
import patika.bookadviserapi.model.dto.response.BookResponse;
import patika.bookadviserapi.service.abstracts.BookService;
import patika.bookadviserapi.utils.ResultMessages;
import patika.bookadviserapi.utils.results.DataResult;
import patika.bookadviserapi.utils.results.ErrorDataResult;
import patika.bookadviserapi.utils.results.SuccessDataResult;

import java.util.List;

@RestController
@RequestMapping("/books")
@CrossOrigin(origins = {"http://localhost:5173", "http://localhost:5174"})
public class BookController {
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public DataResult<BookResponse> findBooks(@RequestBody BookRequest request) {
        BookResponse result = bookService.findBooks(request);

        if (result != null) {
            return new SuccessDataResult<>(result, ResultMessages.LISTING_SUCCESS_MULTI);
        } else {
            return new ErrorDataResult<>(ResultMessages.NOT_FOUND_MULTI);
        }
    }

    @GetMapping
    public DataResult<List<BookDbSaveRequest>> findAll(){
        List<BookDbSaveRequest> result = bookService.findAll();

        if (result != null) {
            return new SuccessDataResult<>(result, ResultMessages.LISTING_SUCCESS_MULTI);
        } else {
            return new ErrorDataResult<>(ResultMessages.NOT_FOUND_MULTI);
        }
    }
}

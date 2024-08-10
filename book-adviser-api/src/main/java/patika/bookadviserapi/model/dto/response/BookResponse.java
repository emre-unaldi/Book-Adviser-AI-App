package patika.bookadviserapi.model.dto.response;

import lombok.*;
import patika.bookadviserapi.model.Book;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookResponse {
    @Builder.Default
    private List<Book> books = new ArrayList<>();
}

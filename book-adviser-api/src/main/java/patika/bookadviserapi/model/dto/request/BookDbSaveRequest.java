package patika.bookadviserapi.model.dto.request;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import patika.bookadviserapi.model.Book;
import patika.bookadviserapi.model.dto.response.BookResponse;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "AI_Books")
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookDbSaveRequest {

    @Id
    private String id;
    @Field(name = "question")
    private String question;
    @Field(name = "books")
    @Builder.Default
    private List<Book> books = new ArrayList<>();
}

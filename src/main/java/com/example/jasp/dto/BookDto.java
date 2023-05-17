package com.example.jasp.dto;

import com.example.jasp.model.Author;
import com.example.jasp.model.Genre;
import com.example.jasp.model.Publisher;
import lombok.*;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class BookDto {
    @NonNull
    private Long id;
    @NonNull
    private String title;

    private String description;
    private Author author;
    private Publisher publisher;
    private Genre genre;
}

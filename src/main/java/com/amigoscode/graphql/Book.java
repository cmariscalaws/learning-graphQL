package com.amigoscode.graphql;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Book(Integer id,
                   String title,
                   Integer pageCount,
                   Integer authorId) {
    public static List<Book> books = Arrays.asList(
            new Book(1, "The Hobbit", 310, 1),
            new Book(2, "The Lord of the Rings", 1178, 1),
            new Book(3, "Harry Potter and the Philosopher's Stone", 223, 2),
            new Book(4, "Harry Potter and the Chamber of Secrets", 251, 2)
    );

    public static Optional<Book> bookById(Integer id) {
        return books.stream()
                .filter(book -> book.id().equals(id))
                .findFirst();
    }

}

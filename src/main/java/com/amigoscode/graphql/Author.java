package com.amigoscode.graphql;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Author(Integer id,
                     String name) {

    public static List<Author> authors = Arrays.asList(
            new Author(1, "J.R.R. Tolkien"),
            new Author(2, "J.K. Rowling"),
            new Author(3, "George R.R. Martin"),
            new Author(4, "Isaac Asimov"));

    public static Optional<Author> getAuthorById(Integer id) {
        return authors.stream()
                .filter(author -> author.id().equals(id))
                .findFirst();
    }
}

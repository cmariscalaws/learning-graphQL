package com.amigoscode.graphql;

import lombok.extern.slf4j.Slf4j;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Slf4j
@Controller
public class BookController {

    @QueryMapping
    public List<Book> books() {
        log.info("books() called");
        return Book.books;
    }

    @QueryMapping
    public Optional<Book> bookById(@Argument Integer id) {
        log.info("bookById() called");
        return Book.bookById(id);
    }

    @SchemaMapping
    public Optional<Author> author(Book book) {
        log.info("author() called");
        return Author.getAuthorById(book.authorId());
    }



}

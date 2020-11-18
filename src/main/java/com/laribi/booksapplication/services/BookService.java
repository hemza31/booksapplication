package com.laribi.booksapplication.services;

import com.laribi.booksapplication.converters.BookConverter;
import com.laribi.booksapplication.entities.BookEntity;
import com.laribi.booksapplication.model.Book;
import com.laribi.booksapplication.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookConverter bookConverter;

    public void addbook(Book body) throws Exception {
        BookEntity bookEntity = bookConverter.toEntity(body);
        bookRepository.save(bookEntity);
    }

    public void deletebook(Long bookId, String apiKey) throws Exception {
        /* TO DO */
    }

    public Book getbookById(Long bookId) throws Exception {
        /*
        Optional<BookEntity> bookEntity = bookRepository.findById(Math.toIntExact(bookId));
        return bookConverter.toModel(bookEntity);
         */
        return null;
    }

    public void updatebook(Book body) throws Exception {
        BookEntity bookEntity = bookConverter.toEntity(body);
        bookRepository.save(bookEntity);
    }
}

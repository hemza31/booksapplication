package com.laribi.booksapplication.controllers;

import com.laribi.booksapplication.api.BookApi;
import com.laribi.booksapplication.model.Book;
import com.laribi.booksapplication.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController    // This means that this class is a Controller
@RequestMapping(path="/")
public class BookController implements BookApi {

    @Autowired
    private BookService bookService;

    @Override
    @RequestMapping(value = "/components", consumes="*/*", method = RequestMethod.POST)
    public void addbook(@Valid Book body) throws Exception {
        bookService.addbook(body);
    }

    @Override
    @RequestMapping(value = "/components", consumes="*/*", method = RequestMethod.PUT)
    public void deletebook(Long bookId, String apiKey) throws Exception {
        bookService.deletebook(bookId, apiKey);
    }

    @Override
    @RequestMapping(value = "/components", consumes="*/*", method = RequestMethod.GET)
    public Book getbookById(Long bookId) throws Exception {
        Book book = bookService.getbookById(bookId);
        return book;
    }

    @Override
    @RequestMapping(value = "/components", consumes="*/*", method = RequestMethod.PUT)
    public void updatebook(@Valid Book body) throws Exception {
        bookService.updatebook(body);
    }

    @Override
    @RequestMapping(value = "/components", consumes="*/*", method = RequestMethod.PUT)
    public void updatebookWithForm(Long bookId, String name, String status) throws Exception {
        /* TO DO */

    }
}

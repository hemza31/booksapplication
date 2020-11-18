package com.laribi.booksapplication.converters;

import com.laribi.booksapplication.entities.BookEntity;
import com.laribi.booksapplication.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookConverter {

    public Book toModel(Optional<BookEntity> bookEntity){
        final Book book = new Book();

        book.setName(bookEntity.getName());

        return book;

    }

    public BookEntity toEntity (Book book){
        final BookEntity bookEntity = new BookEntity();

        bookEntity.setName(book.getName());

        return bookEntity;
    }

    public List<Book> toModelList(List<BookEntity> bookEntityList){

        List<Book> returnedBookList = new ArrayList<Book>();

        Book book;
        for (final BookEntity bookEntity : bookEntityList) {
            book = this.toModel(bookEntity);
            returnedBookList.add(book);
        }
        return returnedBookList;
    }

    public List<BookEntity> toEntitylList(List<Book> bookList){

        List<BookEntity> returnedBookEntityList = new ArrayList<BookEntity>();

        BookEntity bookEntity;
        for (final Book book : bookList) {
            bookEntity = this.toEntity(book);
            returnedBookEntityList.add(bookEntity);
        }

        return returnedBookEntityList;
    }
}

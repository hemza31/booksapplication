package com.laribi.booksapplication.converters;

import com.laribi.booksapplication.entities.BookEntity;
import com.laribi.booksapplication.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookConverter {
    @Autowired CategoryConverter categoryConverter;

    public Book toModel(BookEntity bookEntity){
        final Book book = new Book();

        book.setName(bookEntity.getName());
        book.setCategory(categoryConverter.toModel(bookEntity.getCategory()));
        book.setId(bookEntity.getId());

        return book;

    }

    public BookEntity toEntity (Book book){
        final BookEntity bookEntity = new BookEntity();

        bookEntity.setName(book.getName());
        bookEntity.setCategory(categoryConverter.toEntity(book.getCategory()));

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

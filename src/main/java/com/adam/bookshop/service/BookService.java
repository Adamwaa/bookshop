package com.adam.bookshop.service;

import com.adam.bookshop.model.Book;
import com.adam.bookshop.repository.BookRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Transactional
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return (List<Book>) bookRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    public Book getProduct(Long id) {
        return bookRepository.findById(id)
                .orElse(null);
    }

    public Book getBookByName(String bookName) {

        return bookRepository.findBookByBookName(bookName)
                .orElse(null);
    }

//
    


}

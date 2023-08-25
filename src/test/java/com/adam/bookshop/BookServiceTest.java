package com.adam.bookshop;

import com.adam.bookshop.model.Book;
import com.adam.bookshop.repository.BookRepository;
import com.adam.bookshop.service.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Sort;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {


    @Mock
    private BookRepository bookRepository;

    private BookService bookService;



    @BeforeEach
    public void setUp() {
        bookService = new BookService(bookRepository);
    }


    @Test
    public void getAllBooks() {
        // Arrange
        Book book1 = new Book();
        Book book2 = new Book();
        when(bookRepository.findAll(Sort.by(Sort.Direction.ASC, "id"))).thenReturn(Arrays.asList(book1, book2));

        // Act
        List<Book> result = bookService.getAllBooks();

        // Assert
        assertEquals(2, result.size());
       // verify(bookRepository, times(1)).findAll();
    }

    @Test
    public void saveBookTest() {

        Book book = new Book();

        book.setId(1L);
        book.setBookName("Harry Potter");

        when(bookRepository.save(book)).thenReturn(book);

        Book savedBook = bookService.saveBook(book);

        assertEquals(book.getId(), savedBook.getId());
        assertEquals(book.getBookName(), savedBook.getBookName());
    }

    @Test
    public void getIdTest() {

        Book book = new Book();
        book.setId(1L);

        when(bookRepository.findById(anyLong())).thenReturn(Optional.of(book));


        Book getIdBook = bookService.getProduct(1L);

        assertEquals(book.getId(), getIdBook.getId());
        verify(bookRepository, times(1)).findById(anyLong());
    }


    @Test
    public void getBookByNameTest() {
        Book book = new Book();
        book.setBookName("Harry Potter");
        when(bookRepository.findBookByBookName(anyString())).thenReturn(Optional.of(book));

        Book getBookName = bookService.getBookByName("Harry Potter");

        assertEquals(book.getBookName(), getBookName.getBookName());
        verify(bookRepository, times(1)).findBookByBookName(anyString());
    }


}

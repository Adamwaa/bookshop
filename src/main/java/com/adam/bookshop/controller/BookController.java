package com.adam.bookshop.controller;

import com.adam.bookshop.model.Book;
import com.adam.bookshop.service.BookService;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

;import java.util.List;
import java.util.Map;
import java.util.Objects;


@Controller
public class BookController {

    BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    //adding book
    @GetMapping("/book")
    public String betBookForm(Model model) {
        model.addAttribute("book", new Book());
        return "/book";
    }

    @PostMapping("/book")
    public String saveBook(@ModelAttribute("book") Book book, Model model) {
        bookService.saveBook(book);
        return "/book";
    }
























//    @GetMapping("/book")
//    public String getBookForm(Model model) {
//        // tworzenie nowego obiektu Book
//        model.addAttribute("book", new Book());
//        return "/book";
//    }
////
//    @PostMapping("/book")
//    public String saveBook(@ModelAttribute("book") Book book, Model model) {
//
//        bookService.saveBook(book);
//
//
//        return "/book";
//    }







































































//    private static final Logger log = LoggerFactory.getLogger(BookController.class);
//
//    private final BookService bookService;
//
//    public BookController(BookService bookService) {
//        this.bookService = bookService;
//    }
//
//    @GetMapping("/book")
//    public String getBookForm(Map<String, Object> model) {
//        model.put("book", new Book());
//        return "/book";
//    }
//
//    @PostMapping("/book")
//    public String saveBook(@ModelAttribute("book") Book book, Model model) {
//        if (Objects.equals(book.getBookName(), "")) {
//            model.addAttribute("error", "Book name cannot be null or empty");
//            log.info("Book name cannot be null or empty");
//            return "book";
//        }
//        log.info(book.getBookName());
//        bookService.saveBook(book);
//        return "redirect:/book";
//    }
//
//    @RequestMapping(value = "/listBooks", method = RequestMethod.GET)

    @GetMapping("/listBooks")
    public String listBooks(Model model) {
        try {
            List<Book> book = bookService.getAllBooks();
            model.addAttribute("books", book);
        } catch (DataAccessException e) {
     //       log.error("Error accesing data", e);
            return "error";
        }
        return "listBooks";
    }
//
//
//    @GetMapping("/book/{id}")
//    public String getBookById(@PathVariable("id") Long id, Model model) {
//        Book book = bookService.getProduct(id);
//        if (book == null) {
//            throw new ResourceNotFoundException("Book not found with this ID: " + id);
//
//        }
//        model.addAttribute("book", book);
//        return "bookDetails";
//    }
//
//    @GetMapping("bookname/{bookName}")
//    public String getBookByName(@PathVariable("bookName") String bookName, Model model) {
//        Book book = bookService.getBookByName(bookName);
//        if (book == null) {
//            throw new ResourceNotFoundException("Bok not found with this book name" + bookName);
//        }
//        model.addAttribute("book", book);
//        return "bookDetails";
//    }
//
//
//    @ExceptionHandler(ResourceNotFoundException.class)
//    public ResponseEntity<String> handleResourceNotFoundException(ResourceNotFoundException ex) {
//        log.info(ex.getMessage());
//        System.out.println(ex.getMessage());
//
//        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
//    }
//
//    //update
//
//
//    @GetMapping("/updateBookQuantity")
//    public String getUpdateBookQuantityPage(Model model) {
//        List<Book> books = bookService.getAllBooks();
//        model.addAttribute("books", books);
//        return "updateBookQuantity";
//    }
//
//
//    @PostMapping("/updateBookQuantity")
//    public String updateBookQuantity(@RequestParam Long bookId, @RequestParam Integer newQuantity) {
//        Book book = bookService.getProduct(bookId);
//        book.setQuantity(newQuantity);
//        bookService.saveBook(book);
//        return "redirect:/updateBookQuantity";
//    }
//



}

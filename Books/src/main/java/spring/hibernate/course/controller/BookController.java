package spring.hibernate.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import spring.hibernate.course.entity.Book;
import spring.hibernate.course.service.IBookService;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private IBookService iBookService;

    @GetMapping("/list")
    public String showBooks(Model model){
        List<Book> books = iBookService.showBooks();
        model.addAttribute("books", books);
        return "list-books";
    }

    @GetMapping("/showFormForAdd")
    public String addBook(Model model){
        Book book = new Book();
        model.addAttribute("book", book);
        return "book-form";
    }

    @PostMapping("/saveBook")
    public String saveBook(@ModelAttribute(name = "book") Book book){
        iBookService.saveBook(book);
        return "redirect:/book/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("bookId") int id, Model model){
        Book book = iBookService.getBook(id);
        model.addAttribute(book);
        return "book-form";
    }

    @GetMapping("/deleteBook")
    public String deleteBook(@RequestParam("bookId") int id, Model model){
        iBookService.deleteBook(id);
        return "redirect:/book/list";
    }

}

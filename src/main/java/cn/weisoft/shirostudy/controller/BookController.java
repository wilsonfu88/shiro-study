package cn.weisoft.shirostudy.controller;

import cn.weisoft.shirostudy.bean.Book;
import cn.weisoft.shirostudy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private BookService bookService = null;

    @GetMapping("/book/selectBookById")
    public Book selectBookById(int id){
        return bookService.selectBookById(id);
    }
}

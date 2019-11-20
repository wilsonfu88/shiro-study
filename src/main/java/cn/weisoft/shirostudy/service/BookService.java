package cn.weisoft.shirostudy.service;

import cn.weisoft.shirostudy.bean.Book;
import org.springframework.stereotype.Service;

@Service
public interface BookService {

    public Book selectBookById(int id);
}

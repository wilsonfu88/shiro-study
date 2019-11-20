package cn.weisoft.shirostudy.service.impl;

import cn.weisoft.shirostudy.bean.Book;
import cn.weisoft.shirostudy.mapper.BookMapper;
import cn.weisoft.shirostudy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookMapper bookMapper;

    @Override
    public Book selectBookById(int id) {
        return bookMapper.selectBookById(id);
    }
}

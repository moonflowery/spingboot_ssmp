package com.ch.springboot_08_ssmp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ch.springboot_08_ssmp.dao.BookDao;
import com.ch.springboot_08_ssmp.doman.Book;
import com.ch.springboot_08_ssmp.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chenghao
 * @purpose：
 * @备注：
 * @data 2022年04月28日 17:22
 */
@Service
public class BookServieImpl extends ServiceImpl<BookDao, Book> implements IBookService {
    @Autowired
    private BookDao bookDao;
}

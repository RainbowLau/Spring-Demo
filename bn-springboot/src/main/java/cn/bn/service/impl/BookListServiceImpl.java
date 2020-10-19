package cn.bn.service.impl;

import cn.bn.dao.BookListDao;
import cn.bn.entity.Booklist;
import cn.bn.service.BookListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liuyuzhe@sinosoft.com.cn
 * @date 2020-8-12
 */
@Service
public class BookListServiceImpl implements BookListService {

    @Autowired
    private BookListDao bookListDao;

    @Override
    public List<Booklist> findAll() {
        return bookListDao.findAll();
    }
}

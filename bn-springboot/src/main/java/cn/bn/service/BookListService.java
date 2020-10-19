package cn.bn.service;

import cn.bn.entity.Booklist;

import java.util.List;

/**
 * @author liuyuzhe@sinosoft.com.cn
 * @date 2020-8-12
 */
public interface BookListService {
    List<Booklist> findAll();
}

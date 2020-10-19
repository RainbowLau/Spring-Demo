package cn.bn.dao;

import cn.bn.entity.Booklist;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author liuyuzhe@sinosoft.com.cn
 * @date 2020-8-12
 */
public interface BookListDao extends JpaRepository<Booklist,Integer> {
}

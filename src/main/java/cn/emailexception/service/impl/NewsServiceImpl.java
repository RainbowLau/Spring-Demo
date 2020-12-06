package cn.emailexception..service.impl;

import cn.emailexception..model.auto.News;
import cn.emailexception..mapper.auto.NewsMapper;
import cn.emailexception..service.INewsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author astupidcoder
 * @since 2020-10-28
 */
@Service
public class NewsServiceImpl extends ServiceImpl<NewsMapper, News> implements INewsService {

}

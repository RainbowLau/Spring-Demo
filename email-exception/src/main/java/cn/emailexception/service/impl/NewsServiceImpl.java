package cn.emailexception.service.impl;




import cn.emailexception.mapper.NewsMapper;
import cn.emailexception.model.News;
import cn.emailexception.service.INewsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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

    @Resource
    private NewsMapper newsMapper;

    public News findAll(){
        return newsMapper.selectById("62");
    }


}

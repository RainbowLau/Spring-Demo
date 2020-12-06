package cn.emailexception.service.impl;

import cn.emailexception.model.auto.Topic;
import cn.emailexception.mapper.auto.TopicMapper;
import cn.emailexception.service.ITopicService;
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
public class TopicServiceImpl extends ServiceImpl<TopicMapper, Topic> implements ITopicService {

}

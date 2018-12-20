package top.huangsansui.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.huangsansui.blog.dao.ArticleMapper;
import top.huangsansui.blog.model.Article;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/13
 * @since: JDK 1.8
 */
@Service
public class ArticleServiceImpl implements IArticleService{

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public void test() {
        articleMapper.selectByPrimaryKey(1L);
    }
}

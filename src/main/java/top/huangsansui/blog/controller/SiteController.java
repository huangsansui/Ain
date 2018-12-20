package top.huangsansui.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import top.huangsansui.blog.service.IArticleService;

/**
 * Function:
 * 博客页面跳转控制层
 *
 * @author: Huangqing
 * @Date: 2018/12/12
 * @since: JDK 1.8
 */
@Controller
public class SiteController {

    @Autowired
    private IArticleService articleService;

    /**
     * index
     *
     * @return
     */
    @RequestMapping("/index")
    public String index() {
        articleService.test();
        return "/index";
    }
}

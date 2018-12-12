package top.huangsansui.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/12
 * @since: JDK 1.8
 */
@Controller
@RequestMapping("/site")
public class SiteController {

    @RequestMapping("/index")
    public String getIndex() {
        return "/index";
    }
}

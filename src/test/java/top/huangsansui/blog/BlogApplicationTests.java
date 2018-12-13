package top.huangsansui.blog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import top.huangsansui.blog.service.IArticleService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest

public class BlogApplicationTests {

	@Autowired
	private IArticleService articleService;

	@Test
	public void contextLoads() {
		articleService.test();
	}

}


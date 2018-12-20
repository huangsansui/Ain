package top.huangsansui.blog.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Function:
 * 添加对mapper包扫描
 * 可配置在BlogApplication上，配在数据源上会不打印SQL
 *
 * @author: Huangqing
 * @Date: 2018/12/14
 * @since: JDK 1.8
 */
@Configuration
@MapperScan("top.huangsansui.blog.dao")
public class MyBatisConfig {
}

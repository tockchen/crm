package cn.edu.hnnu.crm;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: crm
 * @description:
 * @author: chen can
 * @create: 2019-06-12 18:59
 */

@Configuration
public class StartPageViewConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/login.html");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }
}

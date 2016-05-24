package tk.jingzing.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by wangyunjing on 16/5/24.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "tk.jingzing")
public class HelloWorldConfiguration {
}

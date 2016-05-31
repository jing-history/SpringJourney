package tk.jingzing.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @version 1.0.0
 * 没有跑成功!!!!!
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("host", "http://blog.didispace.com");
        return "index";
    }

}
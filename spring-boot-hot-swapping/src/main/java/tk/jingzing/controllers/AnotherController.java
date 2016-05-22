package tk.jingzing.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wangyunjing on 16/5/22.
 */
@Controller
public class AnotherController {

    @RequestMapping("/example-2")
    public String example1() {
        return "folder/example";
    }
}

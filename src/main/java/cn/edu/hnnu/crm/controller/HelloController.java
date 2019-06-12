package cn.edu.hnnu.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: crm
 * @description: controller
 * @author: chen can
 * @create: 2019-06-12 10:58
 */
@Controller
public class HelloController {

    @PostMapping("/hello")
    public String Hello(@RequestParam(name = "name") String name, Model model){

        model.addAttribute("name",name);
        return "hello";

    }
}
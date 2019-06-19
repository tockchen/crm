package cn.edu.hnnu.crm.controller;

import cn.edu.hnnu.crm.mapper.UserMapper;
import cn.edu.hnnu.crm.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: crm
 * @description: controller
 * @author: chen can
 * @create: 2019-06-12 10:58
 */
@Controller
public class LoginController {

    @Autowired
    private UserMapper userMapper;



    @PostMapping("/login")
    public String login(@RequestParam(name = "username") String name,
                        @RequestParam(name = "password") String pwd,
                        HttpServletRequest request){
        User user = new User();
        user.setName(name);
        user.setNew_pwd(pwd);
        User user1 = userMapper.select(user);
        if (user1!=null){
            // 登录成功,写cookie 和 session
            request.getSession().setAttribute("name",name);
            request.getSession().setAttribute("id",user1.getId());

            return "redirect:/index";
        }else {
            // 登录失败,重新登录
            return "redirect:/";
        }

    }
}
package cn.caoler.controller;

import cn.caoler.model.User;
import cn.caoler.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Author Caole
 * CreateDate: 2017/9/26
 * CreateTime: 17:01
 */
@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("getUserById")
    public String getUserById(@RequestParam("id") Integer id,
                              Map<String, Object> map){
        User user = this.userService.getUserById(id);
        map.put("user",user);
        return "user";
    }
}

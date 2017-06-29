package cn.com.orange.basic.web.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zcx03 on 2017/6/29.
 */
@Controller
public class LoginHandler {
    @RequestMapping("/login.do")
    public String login(String account,String password){
        System.out.println("login!");
        return "index" ;
    }
}

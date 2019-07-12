package com.zs.controller;

import com.zs.dao.UserDao;
import com.zs.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 * @author zhouson
 * @create 2019-07-11 15:27
 */
@Controller
@RequestMapping(path ="/baidutieba")
public class Login {
    @Autowired
    private UserDao userDao;
    @RequestMapping(path= "/login")
    public String testLogin(HttpServletRequest request, HttpServletResponse response) throws IOException {
        User user = userDao.findByUsernameAndPassword(
                request.getParameter("username"),request.getParameter("password"));
        if (user==null){
           return "failure";
        }else{
           return "success";
        }
    }
}

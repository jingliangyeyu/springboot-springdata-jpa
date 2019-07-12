package com.zs.controller;


import com.zs.dao.UserDao;
import com.zs.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zhouson
 * @create 2019-07-11 13:41
 */
@Controller
@RequestMapping(path = "/baidutieba")
public class Register {
    @Autowired
    private UserDao userDao;
    @RequestMapping(path = "/register")
    public String testRegister(HttpServletRequest request, HttpServletResponse response){
        User user=new User();
        user.setPassword(request.getParameter("password"));
        user.setUsername(request.getParameter("username"));
        userDao.save(user);
        return "success";
    }
}

package com.zs.controller;

import com.zs.dao.PageDao;
import com.zs.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zhouson
 * @create 2019-07-12 10:39
 */
@Controller
@RequestMapping("/baidutieba")
public class Post {
    @Autowired
    private PageDao pageDao;

    @RequestMapping("/post")
    public String testPost(HttpServletResponse response, HttpServletRequest request) {
        String post = request.getParameter("post");
        Page page = new Page();
        page.setPost(post);
        pageDao.save(page);
        return "success";
    }
}

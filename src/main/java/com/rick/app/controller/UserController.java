package com.rick.app.controller;

import com.rick.app.entity.User;
import com.rick.app.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping("/add")
    public String user(ModelMap model, HttpServletRequest request) throws Exception {
        System.out.println("------------aaasdfasdfassdfa------++++++----------");
        User record = new User();
        record.setUserName("anna");
        record.setPassWord("anna");
        record.setGender(1);
        record.setPhone("18000000000");
        record.setCreateTime(new Date());
        record.setUpdateTime(new Date());
        int result = userService.insertData(record);
        System.out.println("result---->" + result);
        model.addAttribute("id", String.valueOf(result));
        return "success";
    }

}
package com.yijia.dianping.controller;

import com.yijia.dianping.common.BusinessException;
import com.yijia.dianping.common.CommonRes;
import com.yijia.dianping.common.EmBusinessError;
import com.yijia.dianping.model.UserModel;
import com.yijia.dianping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

//import com.yijia.dianping.common.BusinessException;

@Controller("/user")
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    @ResponseBody
    public String test() {

        return "test";
    }


    @RequestMapping("/index")
    public ModelAndView index(){
        String userName = "yijia";
        ModelAndView modelAndView = new ModelAndView("/index.html");
        modelAndView.addObject("name",userName);
        return modelAndView;
    }




    @RequestMapping("/get") // get user id
    @ResponseBody
    public CommonRes getUser(@RequestParam(name="id")Integer id) throws BusinessException {
        UserModel userModel = userService.getUser(id);
        if (userModel == null) {
            //return CommonRes.create(new CommonError(EmBusinessError.NO_OBJECT_FOUND), "fail");
            throw new BusinessException(EmBusinessError.NO_OBJECT_FOUND);
        } else {
            return CommonRes.create(userModel);
        }
    }

}

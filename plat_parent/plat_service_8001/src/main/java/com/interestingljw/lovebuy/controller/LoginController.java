package com.interestingljw.lovebuy.controller;

import com.interesting.lovebuy.domain.Employee;
import com.interestingljw.lovebuy.util.AjaxResult;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        System.out.println(employee);
        if ("admin".equals(employee.getName())&&"123".equals(employee.getPassword())){
            return AjaxResult.me();
        }
        return AjaxResult.me().setSuccess(false).setMessage("用户名或密码不正确");
    }
}

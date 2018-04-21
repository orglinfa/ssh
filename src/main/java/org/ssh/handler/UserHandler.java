package org.ssh.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.ssh.entity.UserInfo;
import org.ssh.service.UserService;
@Component
public class UserHandler {
    @Autowired
    private UserService userService;
    @RequestMapping("userLogin")
    public String login(@RequestParam("username")String userName ,@RequestParam("password") String password){
        UserInfo localUser=userService.findByUserName(userName);
        if(userName.equals(localUser.getUsername())&& password.equals(localUser.getPassword()))
        return "success";
        return "failed";
    }
}

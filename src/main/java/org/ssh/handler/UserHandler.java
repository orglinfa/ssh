package org.ssh.handler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.ssh.entity.UserInfo;
import org.ssh.service.UserService;


@Controller
public class UserHandler {
    private  static Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
    @Autowired
    private UserService userService;
    @RequestMapping("/userLogin")
    @ResponseBody
    public String login(@RequestParam("username")String username ,@RequestParam("password") String password){
        logger.info("username================="+username);
        UserInfo localUser=userService.findByUsername(username);
        if(username.equals(localUser.getUsername())&& password.equals(localUser.getPassword()))
        return "success";
        return "failed";
    }
}

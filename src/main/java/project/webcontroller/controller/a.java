package project.webcontroller.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import service.UserService;

@Component
public class a {
    @Reference(version = "1.0.0")
    private UserService userService;

    public String checkUserName(String name){

        return userService.checkUserName(name).toString();

    }
}

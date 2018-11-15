package project.webcontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    a a;

    @RequestMapping(value = "/checkUserName/{name}",method = RequestMethod.GET)
    public String checkUserName(@PathVariable String name){

        return a.checkUserName(name);

    }

}

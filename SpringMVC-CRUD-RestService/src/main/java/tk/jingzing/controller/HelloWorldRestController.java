package tk.jingzing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import tk.jingzing.model.User;
import tk.jingzing.service.UserService;

import java.util.List;

/**
 * Created by wangyunjing on 16/5/24.
 */
@RestController
public class HelloWorldRestController {

    @Autowired
    UserService userService;//Service which will do all data retrieval/manipulation work

    //-------------------Retrieve All Users--------------------------------------------------------
    public ResponseEntity<List<User>> listAllUser(){
        List<User> users = userService.findAllUsers();
        if(users.isEmpty()){
            return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }
}

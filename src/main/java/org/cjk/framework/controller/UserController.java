package org.cjk.framework.controller;

import org.cjk.framework.mapper.TUserMapper;
import org.cjk.framework.model.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private TUserMapper tUserDAO;

    @GetMapping("/list")
    public List<TUser> list() {
        return tUserDAO.selectAll();
    }

    @GetMapping("/user/{id}")
    public TUser getUser(@PathVariable("id") Integer id) {
        return tUserDAO.selectByPrimaryKey(id);
    }
}

package com.laribi.booksapplication.controllers;

import com.laribi.booksapplication.api.UserApi;
import com.laribi.booksapplication.model.User;
import com.laribi.booksapplication.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController    // This means that this class is a Controller
@RequestMapping(path="/")
public class UserController implements UserApi {

    @Autowired
    private UserService userService;

    @Override
    @RequestMapping(value = "/components", consumes="*/*", method = RequestMethod.POST)
    public void createUser(@Valid User body) throws Exception {
        userService.createUser(body);
    }

    @Override
    @RequestMapping(value = "/components", consumes="*/*", method = RequestMethod.POST)
    public void createUsersWithArrayInput(@Valid List<User> body) throws Exception {
        userService.createUsersWithArrayInput(body);
    }

    @Override
    @RequestMapping(value = "/components", consumes="*/*", method = RequestMethod.POST)
    public void createUsersWithListInput(@Valid List<User> body) throws Exception {
        userService.createUsersWithListInput(body);
    }

    @Override
    @RequestMapping(value = "/components", consumes="*/*", method = RequestMethod.PUT)
    public void deleteUser(String username) throws Exception {
        userService.deleteUser(username);
    }

    @Override
    @RequestMapping(value = "/components", consumes="*/*", method = RequestMethod.GET)
    public User getUserByName(String username) throws Exception {
        User user = userService.getUserByName(username);
        return user;
    }

    @Override
    @RequestMapping(value = "/components", consumes="*/*", method = RequestMethod.PUT)
    public String loginUser(@NotNull String username, @NotNull String password) throws Exception {
        String string = userService.loginUser(username, password);
        return string;
    }

    @Override
    @RequestMapping(value = "/components", consumes="*/*", method = RequestMethod.PUT)
    public void logoutUser() throws Exception {
        userService.logoutUser();
    }

    @Override
    @RequestMapping(value = "/components", consumes="*/*", method = RequestMethod.PUT)
    public void updateUser(String username, @Valid User body) throws Exception {
        userService.updateUser(username, body);
    }
}

package com.laribi.booksapplication.services;

import com.laribi.booksapplication.converters.UserConverter;
import com.laribi.booksapplication.entities.UserEntity;
import com.laribi.booksapplication.model.User;
import com.laribi.booksapplication.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserConverter userConverter;

    public void createUser(User body) throws Exception {
        UserEntity userEntity = userConverter.toEntity(body);
        userRepository.save(userEntity);
    }


    public void createUsersWithArrayInput(List<User> body) throws Exception {
   /* TO DO  */
    }


    public void createUsersWithListInput(List<User> body) throws Exception {
        /* TO DO  */
    }


    public void deleteUser(String username) throws Exception {
        /* TO DO  */
    }


    public User getUserByName(String username) throws Exception {
        /* TO DO  */
        return null;
    }


    public String loginUser(String username, String password) throws Exception {
        /* TO DO  */
        return username;
    }


    public void logoutUser() throws Exception {

    }


    public void updateUser(String username, User body) throws Exception {
        /* TO DO  */

    }

}

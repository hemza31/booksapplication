package com.laribi.booksapplication.converters;

import com.laribi.booksapplication.entities.UserEntity;
import com.laribi.booksapplication.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserConverter {

    public User toModel(UserEntity userEntity){
        final User user = new User();

        user.setFirstName(userEntity.getFirstName());
        user.setLastName(userEntity.getLastName());
        user.setEmail(userEntity.getEmail());
        user.setPhone(userEntity.getPhone());
        user.setUsername(userEntity.getUsername());
        user.setId(userEntity.getId());
        user.setPassword(userEntity.getPassword());

        return user;

    }

    public UserEntity toEntity (User user){
        final UserEntity userEntity = new UserEntity();

        userEntity.setFirstName(user.getFirstName());
        userEntity.setLastName(user.getLastName());
        userEntity.setEmail(user.getEmail());
        userEntity.setPhone(user.getPhone());
        userEntity.setUsername(user.getUsername());
        userEntity.setPassword(user.getPassword());

        return userEntity;
    }

    public List<User> toModelList(List<UserEntity> userEntityList){

        List<User> returnedUserList = new ArrayList<User>();

        User user;
        for (final UserEntity userEntity : userEntityList) {
            user = this.toModel(userEntity);
            returnedUserList.add(user);
        }
        return returnedUserList;
    }

    public List<UserEntity> toEntitylList(List<User> userList){

        List<UserEntity> returnedUserEntityList = new ArrayList<UserEntity>();

        UserEntity userEntity;
        for (final User user : userList) {
            userEntity = this.toEntity(user);
            returnedUserEntityList.add(userEntity);
        }

        return returnedUserEntityList;
    }
}

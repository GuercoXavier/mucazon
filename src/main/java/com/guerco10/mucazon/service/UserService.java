package com.guerco10.mucazon.service;

import com.guerco10.mucazon.dto.UserDTO;
import com.guerco10.mucazon.model.User;
import com.guerco10.mucazon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    // method to access data of user table
    public List<UserDTO> getAll(){
        List<User> users = userRepository.findAll();

        return users.stream().map(UserDTO::convert).collect(Collectors.toList());
    }

    //returns a user by its ID
    public UserDTO findById(long id){
        Optional<User> user = userRepository.findById(id);
        if(user.isPresent()) return UserDTO.convert(user.get());

        return null;
    }

    public UserDTO save(UserDTO userDTO){
        User user = userRepository.save(User.convert(userDTO));
        user.setRegistrydate(new Date());
        return UserDTO.convert(user);
    }

    public UserDTO delete(long id){
        Optional<User> user = userRepository.findById(id);

        if (user.isPresent()) userRepository.delete(user.get());

        return null;
    }

    public UserDTO findByIdCard(String idCard){
        User user = userRepository.findByIdcard(idCard);

        if(user != null) return UserDTO.convert(user);

        return null;
    }

    public List<UserDTO>queryByName(String name){
        List<User> users = userRepository.queryByNameLike(name);

        return users.stream().map(UserDTO::convert).collect(Collectors.toList());
    }
}

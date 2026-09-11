package com.guerco10.mucazon.model;

import com.guerco10.mucazon.dto.UserDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
//@Table(schema="users")
public class User {
    //this class must have the same attribute names as the SQL table
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String idcard;
    private String address;
    private String email;
    private String phone;
    private Date registrydate; // to avoid search mismatch with


    // this class is to avoid calls to class user instance everytime we need this instance
    public static User convert(UserDTO userDTO){
        User user = new User();
        user.setName(userDTO.getName());
        user.setIdcard(userDTO.getIdCard());
        user.setAddress(userDTO.getAddress());
        user.setEmail(userDTO.getEmail());
        user.setPhone(userDTO.getPhone());
        user.setRegistrydate(userDTO.getRegistryDate());

        return user;
    }

    // this method runs as a user is created 
    // it just gives the new user the actual registry date
    @PrePersist
    public void setDate(){
        registrydate = new Date();
    }
}

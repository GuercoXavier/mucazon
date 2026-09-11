package com.guerco10.mucazon.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.guerco10.mucazon.model.User;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.Setter;

//import java.util.ArrayList;
import java.util.Date;
//import java.util.List;


@Getter
@Setter
@JsonPropertyOrder({"name", "idCard", "address", "email", "phone", "registryDate"})
public class UserDTO {

    private String name;
    private String idCard;
    private String address;
    private String email;
    private String phone;
    private Date registryDate;

    public static UserDTO convert(User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setName(user.getName());
        userDTO.setIdCard(user.getIdcard());
        userDTO.setAddress(user.getAddress());
        userDTO.setEmail(user.getEmail());
        userDTO.setPhone(user.getPhone());
        userDTO.setRegistryDate(user.getRegistrydate());

        return userDTO;
    }
}

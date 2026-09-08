package com.guerco10.mucazon.service;

import com.guerco10.mucazon.dto.UserDTO;
import jakarta.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserService {
    public static List<UserDTO> users = new ArrayList<>();

    @PostConstruct
    public void initializeList(){
        UserDTO userDto = new UserDTO();

        userDto.setName("Magame");
        userDto.setIdCard("145531");
        userDto.setAddress("Albazine");
        userDto.setEmail("magas@email.com");
        userDto.setPhone("844442664");
        userDto.setRegistryDate(new Date());

        UserDTO userDto2 = new UserDTO();

        userDto2.setName("Wenzel");
        userDto2.setIdCard("1500031");
        userDto2.setAddress("Manhica");
        userDto2.setEmail("wen@email.com");
        userDto2.setPhone("874772664");
        userDto2.setRegistryDate(new Date());

        UserDTO userDto3 = new UserDTO();

        userDto3.setName("Bila");
        userDto3.setIdCard("1099749");
        userDto3.setAddress("town");
        userDto3.setEmail("bila@email.com");
        userDto3.setPhone("82476749");
        userDto3.setRegistryDate(new Date());

        users.add(userDto);
        users.add(userDto2);
        users.add(userDto3);
    }
}

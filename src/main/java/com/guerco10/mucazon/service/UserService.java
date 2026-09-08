package com.guerco10.mucazon.service;

import com.guerco10.mucazon.dto.UserDTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserService {
    public static List<UserDTO> users = new ArrayList<>();

    public UserService(){
        this.initializeList();
    }

//    @PostConstruct
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

        UserDTO userDto4 = new UserDTO();

        userDto4.setName("John Doe");
        userDto4.setIdCard("100");
        userDto4.setAddress("imagiLand");
        userDto4.setEmail("john@email.com");
        userDto4.setPhone("25577431");
        userDto4.setRegistryDate(new Date());

        users.add(userDto);
        users.add(userDto2);
        users.add(userDto3);
        users.add(userDto4);
    }

    public UserDTO getUser(String idCard){
        for(UserDTO user : users){
            if(user.getIdCard().equals(idCard)) return user;
        }

        return null;
    }

    public UserDTO addUser(UserDTO userDTO){
        userDTO.setRegistryDate(new Date());
        users.add(userDTO);

        return userDTO;
    }

    public boolean removeUser(String idCard){
        for(UserDTO user : users){
            if (user.getIdCard().equals(idCard)){
                users.remove(user);
                return true;
            }
        }
        return false;
    }
}

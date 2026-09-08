package com.guerco10.mucazon.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
public class userDTO {

    private String name;
    private String idCard;
    private String address;
    private String email;
    private String phone;
    private Date registryDate;

}

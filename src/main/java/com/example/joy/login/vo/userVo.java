package com.example.joy.login.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode
@ToString
public class userVo {

    private String id;

    private String pw;

    private String name;

    private String useYn;

}

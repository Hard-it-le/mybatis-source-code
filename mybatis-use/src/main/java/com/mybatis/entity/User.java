package com.mybatis.entity;

import lombok.Data;
import lombok.ToString;

/**
 * @date 2022/09/24
 **/
@ToString
@Data
public class User {
  private int id;
  private String username;
  private String password;
  private Boolean isDelete;
}
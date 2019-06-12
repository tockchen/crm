package cn.edu.hnnu.crm.model;

import lombok.Data;

/**
 * @program: crm
 * @description: 实体
 * @author: chen can
 * @create: 2019-06-12 13:32
 */
@Data
public class User {
    private Integer id;

    private String name;
    private String password;

}
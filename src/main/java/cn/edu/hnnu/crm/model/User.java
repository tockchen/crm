package cn.edu.hnnu.crm.model;

/**
 * @program: crm
 * @description: 实体
 * @author: chen can
 * @create: 2019-06-12 13:32
 */
public class User {
    private Integer id;

    private String name;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
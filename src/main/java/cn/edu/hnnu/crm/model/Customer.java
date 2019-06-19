package cn.edu.hnnu.crm.model;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @program: crm
 * @description: 客户表
 * @author: chen can
 * @create: 2019-06-13 14:16
 */
@Data
@ToString
public class Customer {
    Integer cust_id;
    String cust_name;
    Integer cust_user_id;
    Integer cust_create_id;
    String cust_source;
    String cust_industry;
    String cust_level;
    String cust_linkman;
    String cust_phone;
    String cust_mobile;
    String cust_zipcode;
    String cust_address;
    Date cust_createtime;
    Date cust_updatetime;
}
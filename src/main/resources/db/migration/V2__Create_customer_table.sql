-- ----------------------------
-- Table structure for customer
-- ----------------------------

CREATE TABLE customer
(
  cust_id bigint(32) NOT NULL AUTO_INCREMENT COMMENT '客户编号(主键)',
  cust_name varchar(32) NOT NULL COMMENT '客户名称(公司名称)',
  cust_user_id bigint(32) DEFAULT NULL COMMENT '负责人id',
  cust_create_id bigint(32) DEFAULT NULL COMMENT '创建人id',
  cust_source varchar(32) DEFAULT NULL COMMENT '客户信息来源',
  cust_industry varchar(32) DEFAULT NULL COMMENT '客户所属行业',
  cust_level varchar(32) DEFAULT NULL COMMENT '客户级别',
  cust_linkman varchar(64) DEFAULT NULL COMMENT '联系人',
  cust_phone varchar(64) DEFAULT NULL COMMENT '固定电话',
  cust_mobile varchar(16) DEFAULT NULL COMMENT '移动电话',
  cust_zipcod varchar(10) DEFAULT NULL,
  cust_address varchar(100) DEFAULT NULL,

  cust_createtime datetime DEFAULT CURRENT_TIMESTAMP NULL COMMENT '创建时间',
  cust_updatetime timestamp NOT NULL DEFAULT current_timestamp  COMMENT '修改时间',
  PRIMARY KEY(cust_id),

) ENGINE=InnoDB AUTO_INCREMENT=162 DEFAULT CHARSET=utf8 ;


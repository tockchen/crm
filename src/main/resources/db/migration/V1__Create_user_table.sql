CREATE TABLE user(
  id bigint(32) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  code varchar(32) NOT NULL COMMENT '用户账号',
  name varchar(64) NOT NULL COMMENT '用户名称',
  pwd varchar(32) NOT NULL COMMENT '用户密码',
  state char(1) NOT NULL COMMENT '1:正常,0:暂停',
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO user VALUES (null, 'm0001', 'Cone', 'cc', '1');


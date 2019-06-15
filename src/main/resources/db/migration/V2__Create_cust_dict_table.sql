CREATE TABLE cust_dict
(
  dict_id varchar(32) NOT NULL COMMENT '数据字典id(主键)',
  dict_type_code varchar(10) NOT NULL COMMENT '数据字典类别代码',
  dict_type_name varchar(64) NOT NULL COMMENT '数据字典类别名称',
  dict_item_name varchar(64) NOT NULL COMMENT '数据字典项目名称',
  dict_item_code varchar(10) DEFAULT NULL COMMENT '数据字典项目代码(可为空)',
  dict_sort int(10) DEFAULT NULL COMMENT '排序字段',
  dict_enable char(1) NOT NULL COMMENT '1:使用 0:停用',
  dict_memo varchar(64) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (dict_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cust_dict
-- ----------------------------
INSERT INTO cust_dict VALUES ('1', '001', '客户行业', '教育培训 ', null, '1', '1', null);
INSERT INTO cust_dict VALUES ('10', '003', '公司性质', '民企', null, '3', '1', null);
INSERT INTO cust_dict VALUES ('12', '004', '年营业额', '1-10万', null, '1', '1', null);
INSERT INTO cust_dict VALUES ('13', '004', '年营业额', '10-20万', null, '2', '1', null);
INSERT INTO cust_dict VALUES ('14', '004', '年营业额', '20-50万', null, '3', '1', null);
INSERT INTO cust_dict VALUES ('15', '004', '年营业额', '50-100万', null, '4', '1', null);
INSERT INTO cust_dict VALUES ('16', '004', '年营业额', '100-500万', null, '5', '1', null);
INSERT INTO cust_dict VALUES ('17', '004', '年营业额', '500-1000万', null, '6', '1', null);
INSERT INTO cust_dict VALUES ('18', '005', '客户状态', '基础客户', null, '1', '1', null);
INSERT INTO cust_dict VALUES ('19', '005', '客户状态', '潜在客户', null, '2', '1', null);
INSERT INTO cust_dict VALUES ('2', '001', '客户行业', '电子商务', null, '2', '1', null);
INSERT INTO cust_dict VALUES ('20', '005', '客户状态', '成功客户', null, '3', '1', null);
INSERT INTO cust_dict VALUES ('21', '005', '客户状态', '无效客户', null, '4', '1', null);
INSERT INTO cust_dict VALUES ('22', '006', '客户级别', '普通客户', null, '1', '1', null);
INSERT INTO cust_dict VALUES ('23', '006', '客户级别', 'VIP客户', null, '2', '1', null);
INSERT INTO cust_dict VALUES ('24', '007', '商机状态', '意向客户', null, '1', '1', null);
INSERT INTO cust_dict VALUES ('25', '007', '商机状态', '初步沟通', null, '2', '1', null);
INSERT INTO cust_dict VALUES ('26', '007', '商机状态', '深度沟通', null, '3', '1', null);
INSERT INTO cust_dict VALUES ('27', '007', '商机状态', '签订合同', null, '4', '1', null);
INSERT INTO cust_dict VALUES ('3', '001', '客户行业', '对外贸易', null, '3', '1', null);
INSERT INTO cust_dict VALUES ('30', '008', '商机类型', '新业务', null, '1', '1', null);
INSERT INTO cust_dict VALUES ('31', '008', '商机类型', '现有业务', null, '2', '1', null);
INSERT INTO cust_dict VALUES ('32', '009', '商机来源', '电话营销', null, '1', '1', null);
INSERT INTO cust_dict VALUES ('33', '009', '商机来源', '网络营销', null, '2', '1', null);
INSERT INTO cust_dict VALUES ('34', '009', '商机来源', '推广活动', null, '3', '1', null);
INSERT INTO cust_dict VALUES ('4', '001', '客户行业', '酒店旅游', null, '4', '1', null);
INSERT INTO cust_dict VALUES ('5', '001', '客户行业', '房地产', null, '5', '1', null);
INSERT INTO cust_dict VALUES ('6', '002', '客户信息来源', '电话营销', null, '1', '1', null);
INSERT INTO cust_dict VALUES ('7', '002', '客户信息来源', '网络营销', null, '2', '1', null);
INSERT INTO cust_dict VALUES ('8', '003', '公司性质', '合资', null, '1', '1', null);
INSERT INTO cust_dict VALUES ('9', '003', '公司性质', '国企', null, '2', '1', null);
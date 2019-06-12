package cn.edu.hnnu.crm.mapper;

import cn.edu.hnnu.crm.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @program: crm
 * @description: 登录
 * @author: chen can
 * @create: 2019-06-12 13:27
 */
@Mapper
public interface UserMapper {
    @Select("select * from user where name= #{name} and pwd = #{password}")
    User select(User user);
}
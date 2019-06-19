package cn.edu.hnnu.crm.mapper;

import cn.edu.hnnu.crm.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * @program: crm
 * @description: 登录
 * @author: chen can
 * @create: 2019-06-12 13:27
 */
@Mapper
public interface UserMapper {
    @Select("select * from user where name= #{name} and pwd = #{new_pwd}")
    User select(User user);
    @Update("update user set pwd = #{new_pwd} where name = #{name} and pwd = #{old_pwd}")
    int update(User user);
}
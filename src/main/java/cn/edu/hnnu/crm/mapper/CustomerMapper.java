package cn.edu.hnnu.crm.mapper;

import cn.edu.hnnu.crm.model.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CustomerMapper {

    @Select("select * from customer")
    List<Customer> select();
}

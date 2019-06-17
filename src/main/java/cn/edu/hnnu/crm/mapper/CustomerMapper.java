package cn.edu.hnnu.crm.mapper;

import cn.edu.hnnu.crm.model.Customer;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Set;

@Mapper
public interface CustomerMapper {

    @Select("select * from customer")
    List<Customer> select();
    @Select("select distinct cust_name, cust_source,cust_industry,cust_level from customer")
    Set<Customer> selectset();
    @Delete("delete from customer where cust_id=#{id}")
    void delete(Integer id);
    @Select("select * from customer where ((cust_source = #{custSource}) or (cust_industry = #{custIndustry}) or (cust_level = #{custLevel}) or (cust_name like CONCAT('%',#{custName},'%'))) " )
    List<Customer> likeSelect(String custName,String custSource,String custIndustry,String custLevel);

    @Update("update customer set cust_name=#{cust_name},cust_source=#{cust_source},cust_industry=#{cust_industry},cust_level=#{cust_level},cust_linkman=#{cust_linkman},cust_phone=#{cust_phone},cust_mobile=#{cust_mobile},cust_zipcod=#{cust_zipcod},cust_address=#{cust_address} where cust_id=#{cust_id}")
    void update(Customer customer);
}

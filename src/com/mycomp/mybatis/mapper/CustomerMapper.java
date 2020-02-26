package com.mycomp.mybatis.mapper;

/*
 * 动态sql相关:
 * 1. if标签
 * 2. where标签
 * 3. trim标签
 * 4. choose标签
 * 5. set标签
 * 6. foreach标签
 * 7. bind标签
 * 8. sql片段
 */

import com.mycomp.mybatis.domain.Customer;
import com.mycomp.mybatis.domain.QueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerMapper {

    // 根据客户名称和职业来查询
    // where和if标签
    List<Customer> getCustomersByNameAndPro1(@Param("name") String name,
                                             @Param("profession") String profession);

    // trim标签
    List<Customer> getCustomersByNameAndPro2(@Param("name") String name,
                                             @Param("profession") String profession);

    // choose标签
    List<Customer> getCustomersByNameAndPro3(@Param("name") String name,
                                             @Param("profession") String profession);

    // 更新客户
    // set标签
    void updateCustomer(Customer customer);

    // 根据id查询指定的客户, 多个客户
    // foreach标签
    List<Customer> getCustomersById1(Integer[] ids);

    List<Customer> getCustomersById2(List<Integer> ids);

    List<Customer> getCustomersById3(QueryVo vo);

    // 根据id查询一个客户
    // bind标签
    Customer getCustomerById(@Param("id") Integer id);
}

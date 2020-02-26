package com.mycomp.mybatis.test;

import com.mycomp.mybatis.domain.Customer;
import com.mycomp.mybatis.domain.QueryVo;
import com.mycomp.mybatis.mapper.CustomerMapper;
import com.mycomp.mybatis.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MyTest {

    @Test
    public void test1() {
        SqlSession sqlSession = MybatisUtils.openSession();
        CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);

        List<Customer> customers = mapper.getCustomersByNameAndPro1("", "刺客");
        for (Customer customer : customers) {
            System.out.println(customer);
        }

        sqlSession.close();
    }

    @Test
    public void test2() {
        SqlSession sqlSession = MybatisUtils.openSession();
        CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);

        List<Customer> customers = mapper.getCustomersByNameAndPro2("", "刺客");
        for (Customer customer : customers) {
            System.out.println(customer);
        }

        sqlSession.close();
    }

    @Test
    public void test3() {
        SqlSession sqlSession = MybatisUtils.openSession();
        CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);

        List<Customer> customers = mapper.getCustomersByNameAndPro3("亚索", "刺客");
        for (Customer customer : customers) {
            System.out.println(customer);
        }

        sqlSession.close();
    }

    @Test
    public void test4() {
        SqlSession sqlSession = MybatisUtils.openSession();
        CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);

        Customer customer = new Customer();
        customer.setCust_id(15);
        customer.setCust_name("zzqnew");
        customer.setCust_profession("废物");

        mapper.updateCustomer(customer);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test5() {
        SqlSession sqlSession = MybatisUtils.openSession();
        CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);

        List<Customer> customers = mapper.getCustomersById1(new Integer[]{1, 2, 3});
        for (Customer customer : customers) {
            System.out.println(customer);
        }

        sqlSession.close();
    }

    @Test
    public void test6() {
        SqlSession sqlSession = MybatisUtils.openSession();
        CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);

        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        List<Customer> customers = mapper.getCustomersById2(ids);
        for (Customer customer : customers) {
            System.out.println(customer);
        }

        sqlSession.close();
    }

    @Test
    public void test7() {
        SqlSession sqlSession = MybatisUtils.openSession();
        CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);

        QueryVo queryVo = new QueryVo();
        Integer[] ids = new Integer[]{1, 2, 3};
        queryVo.setVoIdsArr(ids);
        List<Customer> customers = mapper.getCustomersById3(queryVo);
        for (Customer customer : customers) {
            System.out.println(customer);
        }

        sqlSession.close();
    }

    @Test
    public void test8() {
        SqlSession sqlSession = MybatisUtils.openSession();
        CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);

        Customer customer = mapper.getCustomerById(2);
        System.out.println(customer);

        sqlSession.close();
    }

}

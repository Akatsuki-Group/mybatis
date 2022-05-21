package org.example.serivce;

import org.example.mapper.MemberMapper;
import org.example.mapper.OrderMapper;
import org.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

	@Autowired
	private UserMapper userMapper; // Mybatis UserMapper代理对象-->Bean

	@Autowired
	private OrderMapper orderMapper;

	@Autowired
	private MemberMapper memberMapper;

	public void test() {
		System.out.println(userMapper.selectById());
		System.out.println(orderMapper.selectById());
		System.out.println(memberMapper.selectById());
	}

}
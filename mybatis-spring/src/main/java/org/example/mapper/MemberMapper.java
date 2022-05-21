package org.example.mapper;

import org.apache.ibatis.annotations.Select;

/**
 * @author tina
 */
public interface MemberMapper {
    /**
     * 测试方法
     */
    @Select("select 'member'")
    String selectById();
}

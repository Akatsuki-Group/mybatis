package org.example.mapper;

import org.apache.ibatis.annotations.Select;

/**
 * @author tina
 */
public interface UserMapper {
    /**
     * 测试方法
     */
    @Select("select 'user'")
    String selectById();
}
